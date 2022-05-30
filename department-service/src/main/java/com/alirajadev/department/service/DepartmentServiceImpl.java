package com.alirajadev.department.service;

import com.alirajadev.department.entity.Department;
import com.alirajadev.department.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department findDepartmentById(Long id) {
        log.info("findDepartmentById: {}", id);
        return departmentRepository.findByDepartmentId(id);
    }

    @Override
    public Department saveDepartment(Department department) {
        log.info("Department saved successfully " + department.toString());
        return departmentRepository.save(department);
    }

}
