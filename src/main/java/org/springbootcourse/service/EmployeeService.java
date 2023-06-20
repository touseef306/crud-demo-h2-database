package org.springbootcourse.service;

import org.springbootcourse.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();

    Employee updateEmployee(Long id, Employee employee);


    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

}
