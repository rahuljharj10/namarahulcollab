package com.namarahul.namarahulcollab.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * DTO for transferring employee data in API responses.
 * Contains basic personal and contact information of an employee.
 */
@Getter
@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {

    /**
     * Unique identifier for the employee.
     */
    private Integer id;

    /**
     * First name of the employee.
     */
    private String firstName;

    /**
     * Last name of the employee.
     */
    private String lastName;

    /**
     * Email address of the employee.
     */
    private String email;

    /**
     * Phone number of the employee.
     */
    private String phoneNumber;
}
