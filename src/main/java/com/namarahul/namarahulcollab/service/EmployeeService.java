package com.namarahul.namarahulcollab.service;

import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.entity.Employee;
import com.namarahul.namarahulcollab.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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

    private final ModelMapper modelMapper;

    /**
     * Retrieves all employees from the repository and maps them to EmployeeResponse DTOs.
     * Uses MapperUtil for conversion.
     *
     * @return List of EmployeeResponse objects representing all employees.
     */
    public List<EmployeeResponse> getAllEmployees() {

        //When you are using way 3
//        return convertToEmployeeResponse(employeeRepository.findAll());

        return employeeRepository.findAll().stream()
                .map(this::convertToEmployeeResponse)
                .toList();
    }

    //Way 1: Using ModelMapper
    private EmployeeResponse convertToEmployeeResponse(Employee employee) {

        return modelMapper.map(employee, EmployeeResponse.class);
    }

    //Way 2: Using ObjectMapperUtils(Generics)
//    private EmployeeResponse convertToEmployeeResponse(Employee employee) {
//
//        return ObjectMapperUtils.map(employee, EmployeeResponse.class);
//    }

    //Way 3: Using ObjectMapperUtils(Generics)
//    private List<EmployeeResponse> convertToEmployeeResponse(List<Employee> employee) {
//
//        return ObjectMapperUtils.mapAll(employee, EmployeeResponse.class);
//    }
}
