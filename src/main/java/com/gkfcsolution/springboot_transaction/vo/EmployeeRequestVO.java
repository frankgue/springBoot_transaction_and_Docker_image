package com.gkfcsolution.springboot_transaction.vo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2025 at 17:51
 * File: null.java
 * Project: springBoot_transaction
 *
 * @author Frank GUEKENG
 * @date 06/10/2025
 * @time 17:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeRequestVO {
    private String empName;
    private String email;
    private String departmentName;
}
