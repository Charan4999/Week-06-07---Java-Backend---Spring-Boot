package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.core.beans.Department;
import com.spring.core.beans.Employee;
import com.spring.core.beans.Logging;

@SpringBootApplication  
public class SpringCoreDemoApplication implements CommandLineRunner {

    @Autowired  
    private Employee employeeBean;

    @Autowired  
    private Department departmentBean;

    @Autowired
    private Logging loggerService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreDemoApplication.class, args);  
    }

    @Override
    public void run(String... args) throws Exception {
        
        employeeBean.printEmployeeDetails();
        departmentBean.printDepartmentDetails();

       
        loggerService.logEmployeeDetails(employeeBean);
        loggerService.logDepartmentDetails(departmentBean);
    }
}
