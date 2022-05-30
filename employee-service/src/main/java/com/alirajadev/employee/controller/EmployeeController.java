package com.alirajadev.employee.controller;

import com.alirajadev.employee.VO.ResponseTemplateVO;
import com.alirajadev.employee.entity.Employee;
import com.alirajadev.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/{employeeId}")
    public ResponseTemplateVO getEmployeeById(@PathVariable("employeeId") long employeeId) {
        log.info("getEmployeeById() invoked");
        return employeeServiceImpl.getEmployeeById(employeeId);
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        log.info("Creating employee: {}", employee);
        return employeeServiceImpl.createEmployee(employee);
    }
}
