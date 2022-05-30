package com.alirajadev.employee.service;

import com.alirajadev.employee.VO.ResponseTemplateVO;
import com.alirajadev.employee.entity.Employee;

public interface EmployeeService {

    ResponseTemplateVO getEmployeeById(long employeeId);

    Employee createEmployee(Employee employee);
}
