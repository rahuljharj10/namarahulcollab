package com.namarahul.namarahulcollab.interfacebasedprojection;

import com.namarahul.namarahulcollab.exception.EmployeeNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing employee-related operations using interface-based projections.
 * It interacts with the IEmployeeRepository to fetch employee data
 * and uses interface-based projections to retrieve specific fields.
 */
@Service
@RequiredArgsConstructor
public class IEmployeeService {

    private final IEmployeeRepository employeeRepository;

    /**
     * Retrieves all employees and maps them to a list of EmployeeResponse DTOs.
     *
     * @return List of EmployeeResponse DTOs.
     * @throws RuntimeException if no employees are found.
     */
    public List<IJuniorEmployeeResponse> getAllEmployeeFirstNameAndLastName() {

        List<IJuniorEmployeeResponse> employees = employeeRepository.getAllEmployeeFirstNameAndLastName();

        if (employees.isEmpty()) {
            throw new EmployeeNotFoundException("No employees found.");
        }

        return employees;
    }

    /**
     * Retrieves an employee's email by their ID.
     *
     * @param id The ID of the employee whose email is to be retrieved.
     * @return IEmployeeEmail containing the email of the employee.
     * @throws EmployeeNotFoundException if no employee is found with the given ID.
     */
    public IEmployeeEmailResponse getEmailById(Integer id) {

        IEmployeeEmailResponse employee = employeeRepository.getEmailById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));

        return employee;
    }
}
