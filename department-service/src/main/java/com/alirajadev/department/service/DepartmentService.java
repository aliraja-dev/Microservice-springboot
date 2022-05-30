package com.alirajadev.department.service;

import com.alirajadev.department.entity.Department;

public interface DepartmentService {

    public Department findDepartmentById(Long departmentId);

    public Department saveDepartment(Department department);

}
