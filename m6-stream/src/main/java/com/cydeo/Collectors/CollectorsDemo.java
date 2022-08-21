package com.cydeo.Collectors;

import com.cydeo.DishCalories.Dish;
import com.cydeo.DishCalories.DishData;
import com.cydeo.DishCalories.Type;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

//toCollection(Supplier) : is used to create a Collection using collector
        
        List<Integer> numberList = numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("numberList = " + numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("numberSet = " + numberSet);
        
        
//toList(): returns a Collector interface that gathers the input data into a new list
        
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toList());

        System.out.println("numberList2 = " + numberList2);

//toSet(): return a Collector interface that gathers the input data into a new set
        
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x ->x%2 ==0)
                .collect(Collectors.toSet());

        System.out.println("numberSet2 = " + numberSet2);

//toMap(Function, Function): returns a Collector interface that gathers the input data into a new Map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println("dishMap = " + dishMap);

//summingInt(toIntFunction) : returns a Collector that produces the sum of a Integer-value function

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish:: getCalories));
        System.out.println(sum);
        
        
//counting() : returns a Collector that counts the number of the elements
        
        Long eventCount = numbers.stream()
                .filter(x->x%2 ==0)
                .collect(Collectors.counting()); // or stream().count()
        System.out.println("eventCount = " + eventCount);
        
//averagingInt(ToIntFunction) : returns the average of the integers passed values
        
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println("calorieAverage = " + calorieAverage);
        
//joining(): is used to join various elements of a character or string array into a single object
        
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        courses.stream()
                .collect(Collectors.joining(",")); // split(",");
        System.out.println("courses = " + courses);

//partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish:: isVegetarian));
        System.out.println("veggieDish = " + veggieDish);


//groupingBy() : is used for grouping objects by some property and storing results in a Map instance

        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect((Collectors.groupingBy(Dish:: getType)));
        System.out.println("dishType = " + dishType);

    }
}
