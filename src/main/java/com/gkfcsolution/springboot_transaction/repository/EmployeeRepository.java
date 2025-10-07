package com.gkfcsolution.springboot_transaction.repository;

import com.gkfcsolution.springboot_transaction.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 17:48
 * File: null.java
 * Project: springBoot_transaction
 *
 * @author Frank GUEKENG
 * @date 06/10/2025
 * @time 17:48
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
