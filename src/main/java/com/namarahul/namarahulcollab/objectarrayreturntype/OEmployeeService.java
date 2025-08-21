package com.namarahul.namarahulcollab.objectarrayreturntype;

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
public class OEmployeeService {

    private final OEmployeeRepository employeeRepository;

    /**
     * Retrieves all employees' first names and last names as a list of OJuniorEmployee projections.
     *
     * @return List of OJuniorEmployee containing first and last names of all employees.
     * @throws EmployeeNotFoundException if no employees are found.
     */
    public List<OJuniorEmployeeResponse> getAllEmployeeFirstNameAndLastName() {

        List<Object[]> results = employeeRepository.getAllEmployeeFirstNameAndLastName();
        List<OJuniorEmployeeResponse> employees = results.stream()
                .map(employee -> OJuniorEmployeeResponse.builder()
                        .firstName((String) employee[0])
                        .lastName((String) employee[1])
                        .build())
                .toList();

        if (employees.isEmpty()) {
            throw new EmployeeNotFoundException("No employees found.");
        }

        return employees;
    }

    /**
     * Retrieves an employee's email by their ID.
     *
     * @param id The ID of the employee whose email is to be retrieved.
     * @return OEmployeeEmailResponse containing the email of the employee.
     * @throws EmployeeNotFoundException if no employee is found with the given ID.
     */
    public OEmployeeEmailResponse getEmailById(Integer id) {

        Object[] employee = employeeRepository.getEmailById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));

        return OEmployeeEmailResponse.builder().email((String) employee[0]).build();
    }
}
