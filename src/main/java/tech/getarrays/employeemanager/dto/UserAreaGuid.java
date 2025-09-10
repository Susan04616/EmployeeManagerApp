package tech.getarrays.employeemanager.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserAreaGuid {
    private UUID areaGuid;
}
