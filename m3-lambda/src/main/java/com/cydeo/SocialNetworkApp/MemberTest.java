package com.cydeo.SocialNetworkApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

         Person p1 = new Person("mike", 35, Gender.MALE);
         Person p2 = new Person("ozzy", 25, Gender.MALE);
         Person p3 = new Person("ally", 15, Gender.FEMALE);
         Person p4 = new Person("tom", 45, Gender.MALE);

         List<Person> personList = Arrays.asList(p1,p2,p3,p4);

         CheckMember memberLambda = p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;
         print(personList, memberLambda);

         //or

        print(personList, p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25);

    }

    private static void print(List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if(checkMember.test(person)){
                System.out.println(person);
            }
        }
        System.out.println(result);
    }

}
