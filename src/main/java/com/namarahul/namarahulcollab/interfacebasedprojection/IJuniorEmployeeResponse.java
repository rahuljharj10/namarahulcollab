package com.namarahul.namarahulcollab.interfacebasedprojection;

/**
 * Interface representing a view of an employee's name.
 * This interface is used for projection to retrieve only the first and last names of employees.
 */
public interface IJuniorEmployeeResponse {

    /**
     * Gets the first name of the employee.
     *
     * @return the first name of the employee.
     */
    String getFirstName();

    /**
     * Gets the last name of the employee.
     *
     * @return the last name of the employee.
     */
    String getLastName();
}
