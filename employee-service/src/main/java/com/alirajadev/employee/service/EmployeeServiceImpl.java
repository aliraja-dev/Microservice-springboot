package com.alirajadev.employee.service;

import com.alirajadev.employee.VO.Department;
import com.alirajadev.employee.VO.ResponseTemplateVO;
import com.alirajadev.employee.entity.Employee;
import com.alirajadev.employee.respository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ResponseTemplateVO getEmployeeById(long employeeId) {
        ResponseTemplateVO response = new ResponseTemplateVO();

        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        log.info(" Employee found with id: {}", employee);

        Department department = restTemplate
                .getForObject("http://DEPARTMENT-SERVICE/department/" + employee.getDepartmentId(), Department.class);
        response.setDepartment(department);
        response.setEmployee(employee);
        return response;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

}
