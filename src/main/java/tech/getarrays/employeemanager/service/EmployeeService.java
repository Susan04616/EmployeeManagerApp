package tech.getarrays.employeemanager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.dto.EmployeeDto;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(EmployeeDto employeeDto) {
        employeeDto.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(setEmployeeInfo(employeeDto));
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(EmployeeDto employeeDto) {
        return employeeRepo.save(setEmployeeInfo(employeeDto));
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).
                orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found"));
    }

    private Employee setEmployeeInfo(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setEmployeeCode(employeeDto.getEmployeeCode());
        employee.setEmail(employeeDto.getEmail());
        employee.setImageUrl(employeeDto.getImageUrl());
        employee.setJobTitle(employeeDto.getJobTitle());
        return employee;
    }
}
