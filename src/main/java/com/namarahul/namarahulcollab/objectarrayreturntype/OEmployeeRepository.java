package com.namarahul.namarahulcollab.objectarrayreturntype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing employee-related operations.
 * It extends JpaRepository to provide CRUD operations and custom queries.
 * This repository uses native SQL queries to retrieve specific fields from the employee table.
 */
@Repository
public interface OEmployeeRepository extends JpaRepository<OEmployeeEntity, Integer> {

    /**
     * Retrieves all employees' first names and last names as a list of Object arrays.
     * Each Object array contains the first name and last name of an employee.
     *
     * @return List of Object arrays containing first name and last name of all employees.
     */
    @Query(value = """
            SELECT first_name , last_name FROM employee
            """, nativeQuery = true)
    List<Object[]> getAllEmployeeFirstNameAndLastName();

    /**
     * Retrieves an employee's email by their ID.
     *
     * @param id The ID of the employee whose email is to be retrieved.
     * @return Optional containing the email of the employee, or empty if not found.
     */
    @Query(value = """
            SELECT e.email FROM employee e WHERE e.id=:id
            """, nativeQuery = true)
    Optional<Object[]> getEmailById(@Param("id") Integer id);
}
