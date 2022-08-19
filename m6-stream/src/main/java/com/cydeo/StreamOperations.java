package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,4,5);
        //list.forEach(x -> System.out.println(x));
        //or
        list.forEach(System.out::println);

        //FILTER
        System.out.println("---------Filter---------------");
        list.stream()
                .filter(i -> i%2 ==0) // intermediate operation
                .forEach(System.out:: println); // terminal operation

        //if you need to continue stream flow
        // list.stream() and so on.

        System.out.println("----------Distinct---------------");
        Stream<Integer> str = list.stream()
                .filter(i ->i%2 ==0)
                .distinct();
        str.forEach(System.out::println);

        System.out.println("-----------Limit------------------");

        list.stream()
                .filter(i ->i%2 ==0)
                .limit(1)
                .forEach(System.out::println);

    }
}
