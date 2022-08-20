package com.cydeo.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@AllArgsConstructor
@Getter

public class Employee {

    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;

}

