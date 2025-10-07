package com.gkfcsolution.springboot_transaction.service;

import com.gkfcsolution.springboot_transaction.entity.Department;
import com.gkfcsolution.springboot_transaction.entity.Employee;
import com.gkfcsolution.springboot_transaction.repository.DepartmentRepository;
import com.gkfcsolution.springboot_transaction.repository.EmployeeRepository;
import com.gkfcsolution.springboot_transaction.vo.EmployeeRequestVO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2025 at 17:54
 * File: null.java
 * Project: springBoot_transaction
 *
 * @author Frank GUEKENG
 * @date 06/10/2025
 * @time 17:54
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public String saveEmployee(EmployeeRequestVO employeeRequestVO) {
        Department department = Department.builder()
                .departmentName(employeeRequestVO.getDepartmentName())
                .departmentCode(employeeRequestVO.getDepartmentName())
                .build();
        Long departmentId = departmentRepository.save(department).getDepartmentId();

        Employee employee = Employee.builder()
                .empName(employeeRequestVO.getEmpName())
                .email(employeeRequestVO.getEmail())
                .departmentId(departmentId)
                .build();

        Employee saveEmployee = employeeRepository.save(employee);

        System.out.println("Employee is saved with Employee ID: " + saveEmployee.getEmployeeId());
        return "Employee is saved with Employee ID: " + saveEmployee.getEmployeeId();
    }
}
