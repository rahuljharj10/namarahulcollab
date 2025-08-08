package com.namarahul.namarahulcollab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

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
public class Employee {

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

    /**
     * Phone number of the employee.
     */
    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    /**
     * Date when the employee was hired.
     */
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    /**
     * Job title of the employee.
     */
    @Column(name = "job_title", length = 100)
    private String jobTitle;

    /**
     * Salary of the employee.
     */
    @Column(name = "salary", precision = 10, scale = 2)
    private BigDecimal salary;

    /**
     * Indicates if the employee is currently active.
     */
    @Column(name = "is_active")
    private Boolean isActive;

    /**
     * Timestamp when the employee record was created.
     */
    @Column(name = "created_at")
    private Instant createdAt;

    /**
     * Timestamp when the employee record was last updated.
     */
    @Column(name = "updated_at")
    private Instant updatedAt;
}
