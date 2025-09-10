package tech.getarrays.employeemanager.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class DailyEmailDto {
    private UUID userGuid;
    private List<UserAreaGuid> userAreaGuids;
}
