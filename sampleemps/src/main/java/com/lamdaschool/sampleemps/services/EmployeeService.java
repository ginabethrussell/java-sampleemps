package com.lamdaschool.sampleemps.services;

import com.lamdaschool.sampleemps.models.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAllEmployees();
}
