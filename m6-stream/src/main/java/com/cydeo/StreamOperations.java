package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(x -> System.out.println(x));
        //or
        list.forEach(System.out::println);

        //FILTER
        list.stream()
                .filter(i -> i%2 ==0) // intermediate operation
                .forEach(System.out:: println); // terminal operation
    }
}
