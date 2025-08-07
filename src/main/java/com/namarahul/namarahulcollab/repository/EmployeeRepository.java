package com.namarahul.namarahulcollab.repository;

import com.namarahul.namarahulcollab.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Employee entities.
 * It extends JpaRepository to provide CRUD operations and query methods.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Additional query methods can be defined here if needed
}
