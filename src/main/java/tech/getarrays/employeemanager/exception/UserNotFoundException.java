package tech.getarrays.employeemanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }

    public static ResponseEntity<String> buildExceptionResponseEntity(Exception e) {
        if (e instanceof NotFoundException) {
            //return Response.status(Response.Status.NOT_FOUND).build();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else if (e instanceof BadRequestException) {
            //return Response.status(Response.Status.BAD_REQUEST).build();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            //AWSXRay.getCurrentSegmentOptional().ifPresent(s -> s.addException(e));
            //return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
