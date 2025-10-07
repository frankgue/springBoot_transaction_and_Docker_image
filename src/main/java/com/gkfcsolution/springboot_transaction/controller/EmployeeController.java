package com.gkfcsolution.springboot_transaction.controller;

import com.gkfcsolution.springboot_transaction.entity.Employee;
import com.gkfcsolution.springboot_transaction.service.EmployeeService;
import com.gkfcsolution.springboot_transaction.vo.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 17:50
 * File: null.java
 * Project: springBoot_transaction
 *
 * @author Frank GUEKENG
 * @date 06/10/2025
 * @time 17:50
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public String saveEmployee(@RequestBody EmployeeRequestVO employeeRequestVO){
        return employeeService.saveEmployee(employeeRequestVO);
    }

}
