package com.cydeo.PersonTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1 = new Person("mike", 35, Gender.MALE);
        Person p2 = new Person("ozzy", 35, Gender.MALE);
        Person p3 = new Person("tom", 35, Gender.MALE);
        Person p4 = new Person("ally", 35, Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);


    }

    private static void print(List<Person> personList, CheckMember checkMember){
        List<Person> result = new ArrayList<>();

        for(Person person : personList){
            if(checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
