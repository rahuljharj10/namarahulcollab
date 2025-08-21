package com.namarahul.namarahulcollab.interfacebasedprojection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing Employee entities.
 * It extends JpaRepository to provide CRUD operations and query methods.
 */
@Repository
public interface IEmployeeRepository extends JpaRepository<IEmployeeEntity, Integer> {

    /**
     * Retrieves all employees' first names and last names.
     *
     * @return List of EmployeeNameView containing first and last names of all employees.
     */
    @Query(value = """
            SELECT first_name , last_name FROM employee
            """, nativeQuery = true)
    List<IJuniorEmployeeResponse> getAllEmployeeFirstNameAndLastName();

    /**
     * Retrieves an employee's email by their ID.
     *
     * @param id The ID of the employee whose email is to be retrieved.
     * @return Optional containing IEmployeeEmailResponse with the employee's email, or empty if not found.
     */
    @Query(value = """
            SELECT e.email FROM employee e WHERE e.id=:id
            """, nativeQuery = true)
    Optional<IEmployeeEmailResponse> getEmailById(@Param("id") Integer id);
}
