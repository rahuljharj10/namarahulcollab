package com.namarahul.namarahulcollab.service;

import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.repository.EmployeeRepository;
import com.namarahul.namarahulcollab.util.MapperUtil;
import lombok.RequiredArgsConstructor;
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
}
