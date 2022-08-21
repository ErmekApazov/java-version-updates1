package com.cydeo.FindingMatching;

import com.cydeo.DishCalories.Dish;
import com.cydeo.DishCalories.DishData;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("ALL MATCH:");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH:");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH:");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY:");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        System.out.println(dish.get());

        System.out.println("FIND FIRST:");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish);
        System.out.println(dish.get());

//PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0, 100).parallel().findAny()); // IntStream.range(0,100) - creating numbers;
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        System.out.println("---------PARALLELStream()----------------");
        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);

        System.out.println(findFirst.get()); // finding first object
        System.out.println(findAny.get()); //finding random objects

        System.out.println("-------------REGULAR STREAM()---------------------");

        Optional<String> findFirst2 = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny2 = list1.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst2.get());
        System.out.println(findAny2.get());


        System.out.println("-------------MIN AND MAX---------------------");
        //DishData.getAll().stream().sorted().findFirst();
        Optional<Dish> dishMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMin.get());

        Optional<Dish> dishMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMax.get());
    }
}
