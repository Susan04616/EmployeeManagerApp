package tech.getarrays.employeemanager.dto;

import lombok.Data;

@Data
public class KpiDto {
    private String id;
    private String definitionId;
    private String areaId;
    private Integer value;
    private String date;
    private String name;
    private String uom;
}
