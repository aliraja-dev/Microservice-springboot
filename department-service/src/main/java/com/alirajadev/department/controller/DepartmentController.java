package com.alirajadev.department.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.extern.slf4j.Slf4j;

import com.alirajadev.department.entity.Department;
import com.alirajadev.department.service.DepartmentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;
    private static final String service = "DepartmentService";

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Department saved successfully " + department.toString());
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    // @CircuitBreaker(name = service, fallbackMethod = "getDepartmentFallback")
    @RateLimiter(name = service)
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }

    public String getDepartmentFallBack(Exception e) {
        return "Department Service is down";
    }

}
