package tech.getarrays.employeemanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KpiValue {
    private List<KpiDto> values;

    public List<KpiDto> getValues() {
        return values;
    }

    public void setValues(List<KpiDto> values) {
        this.values = values;
    }
}
