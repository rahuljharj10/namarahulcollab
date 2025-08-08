package com.namarahul.namarahulcollab.service;

import com.namarahul.namarahulcollab.dto.Request.SaveEmployeeRequest;
import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.entity.Employee;
import com.namarahul.namarahulcollab.repository.EmployeeRepository;
import com.namarahul.namarahulcollab.util.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

/**
 * Service class for managing employee-related operations.
 * It interacts with the EmployeeRepository to fetch employee data
 * and uses MapperUtil to convert entities to DTOs.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    /**
     * Retrieves an employee by ID and maps it to EmployeeResponse DTO.
     *
     * @param id The ID of the employee to retrieve.
     * @return EmployeeResponse DTO of the found employee.
     * @throws RuntimeException if employee is not found.
     */
    public EmployeeResponse getEmployeesById(Integer id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        return MapperUtil.mapEmployeeToEmployeeResponse(employee);
    }

    /**
     * Retrieves all employees from the repository and maps them to EmployeeResponse DTOs.
     * Uses MapperUtil for conversion.
     *
     * @return List of EmployeeResponse objects representing all employees.
     */
    public List<EmployeeResponse> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(MapperUtil::mapEmployeeToEmployeeResponse)
                .toList();
    }

    /**
     * Saves a new employee to the database.
     *
     * @param saveEmployeeRequest Employee data to save
     */
    public void saveEmployee(SaveEmployeeRequest saveEmployeeRequest) {

        Employee employee = Employee.builder()
                .id(saveEmployeeRequest.getId())
                .firstName(saveEmployeeRequest.getFirstName())
                .lastName(saveEmployeeRequest.getLastName())
                .email(saveEmployeeRequest.getEmail())
                .phoneNumber(saveEmployeeRequest.getPhoneNumber())
                .hireDate(LocalDate.now())
                .jobTitle(saveEmployeeRequest.getJobTitle())
                .salary(saveEmployeeRequest.getSalary())
                .isActive(saveEmployeeRequest.getIsActive())
                .createdAt(Instant.now())
                .updatedAt(Instant.now())
                .build();

        employeeRepository.save(employee);
    }
}
