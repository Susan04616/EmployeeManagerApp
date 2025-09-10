package tech.getarrays.employeemanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;

import java.time.LocalDate;
@Data
public class Period {
    private String periodName;
    private Double verifiedScore;
    private String scoreType;
    private Integer periodId;
    @JsonSerialize(
            using = LocalDateSerializer.class
    )
    private LocalDate startDate;
    @JsonSerialize(
            using = LocalDateSerializer.class
    )
    private LocalDate endDate;
    private Integer periodNumber;
    private String traccVersion;
    @JsonIgnore
    private Boolean userOfAgg;
}
