package com.namarahul.namarahulcollab.service;

import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.entity.Employee;
import com.namarahul.namarahulcollab.repository.EmployeeRepository;
import com.namarahul.namarahulcollab.util.ObjectMapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

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
    // (RAHUL) - By default no way to see , you have to see by hitting the endpoint or by adding loggers
    @Cacheable(cacheNames = "employees", key = "#id")
    public EmployeeResponse getEmployeesById(Integer id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        return convertToEmployeeResponse(employee);
    }

    // (RAHUL) - if no key passed all the parameter become key
//    @Cacheable(cacheNames =  "employees")
//    public EmployeeResponse getEmployeesById(Integer id) {
//
//        Employee employee = employeeRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
//
//        return convertToEmployeeResponse(employee);
//    }

    /**
     * Retrieves all employees from the repository and maps them to EmployeeResponse DTOs.
     * Uses MapperUtil for conversion.
     *
     * @return List of EmployeeResponse objects representing all employees.
     */
    @Cacheable(cacheNames = "all-employees")
    public List<EmployeeResponse> getAllEmployees() {

        return employeeRepository.findAll().stream()
                .map(this::convertToEmployeeResponse)
                .toList();
    }

    private EmployeeResponse convertToEmployeeResponse(Employee employee) {

        return ObjectMapperUtils.map(employee, EmployeeResponse.class);
    }
}
