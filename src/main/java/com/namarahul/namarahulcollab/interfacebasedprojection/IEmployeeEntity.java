package com.namarahul.namarahulcollab.interfacebasedprojection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class representing an employee record in the database.
 * Contains personal and employment details for each employee.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class IEmployeeEntity {

    /**
     * Unique identifier for the employee.
     */
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * First name of the employee.
     */
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    /**
     * Last name of the employee.
     */
    @Column(name = "last_name", length = 50)
    private String lastName;

    /**
     * Email address of the employee.
     */
    @Column(name = "email", length = 100)
    private String email;
}
