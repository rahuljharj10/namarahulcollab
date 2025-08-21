package com.namarahul.namarahulcollab.interfacebasedprojection;

/**
 * Interface representing a projection for an employee's email.
 * This interface is used to retrieve only the email of an employee.
 */
public interface IEmployeeEmailResponse {

    /**
     * Gets the email of the employee.
     *
     * @return the email address of the employee.
     */
    String getEmail();
}
