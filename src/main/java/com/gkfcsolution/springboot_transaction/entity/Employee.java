package com.gkfcsolution.springboot_transaction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Created on 2025 at 17:45
 * File: null.java
 * Project: springBoot_transaction
 *
 * @author Frank GUEKENG
 * @date 06/10/2025
 * @time 17:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String empName;
    private String email;
    private Long departmentId;
}
