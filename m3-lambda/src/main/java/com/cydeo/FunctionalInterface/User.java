package com.cydeo.FunctionalInterface;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
@AllArgsConstructor
@Getter
@Setter
@ToString
*/

@Data
@AllArgsConstructor

public class User {

    private String firstName;
    private String lastName;
    private int age;

}
