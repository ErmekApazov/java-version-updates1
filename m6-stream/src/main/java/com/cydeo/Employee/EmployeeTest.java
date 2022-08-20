package com.cydeo.Employee;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Print all Emails:");
        EmployeeData.readAll()
                //.map(employee->employee.getEmpEmail())
                //or
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        System.out.println("Print all Phone Numbers:");
        EmployeeData.readAll()
                //.map(Employee::getEmpPhoneNumbers) - will give stream.of stream result
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
