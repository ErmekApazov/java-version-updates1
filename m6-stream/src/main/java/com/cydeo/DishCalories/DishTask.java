package com.cydeo.DishCalories;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories:

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(dish -> dish.getName())
                //or
                //map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("---------1---------");


        // Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                //or
                //.map(dish -> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("--------2---------");

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(dish -> dish.getName())
                //or
                //.map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--------3----------");



        //Print all dish name that are below 400 calories in the sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                //.sorted(Comparator.comparing(Dish::getCalories).reversed()) // for sorting reversely
                .map(Dish::getName)
                .forEach(System.out::println);


        //Stream<Dish> dishStream = DishData.getAll().stream();
        //dishStream.








    }
}
