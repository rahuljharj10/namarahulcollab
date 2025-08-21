package com.namarahul.namarahulcollab.objectarrayreturntype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Response DTO for transferring employee email data.
 * Contains the email address of an employee.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OEmployeeEmailResponse {

    /**
     * Email address of the employee.
     * Used for communication and as a unique identifier in the system.
     */
    private String email;
}
