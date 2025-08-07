package com.namarahul.namarahulcollab.util;

import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.entity.Employee;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Utility class for mapping entities to DTOs.
 * This class provides methods to convert Employee entities to EmployeeResponse DTOs.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtil {

    /**
     * Maps an Employee entity to an EmployeeResponse DTO.
     *
     * @param employee the Employee entity to be mapped
     * @return an EmployeeResponse DTO containing the employee's details
     */
    public static EmployeeResponse mapEmployeeToEmployeeResponse(Employee employee) {
        return EmployeeResponse.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .phoneNumber(employee.getPhoneNumber())
                .build();
    }
}
