package com.cydeo.Employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2022027844", "2020345443")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("5423435234", "2345453234")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("7645376865", "2342346555"))
        );



    }
}
