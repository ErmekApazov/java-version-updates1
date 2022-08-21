package com.cydeo.Reducing;

import com.cydeo.DishCalories.Dish;
import com.cydeo.DishCalories.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

/*        int sum = 0;

        for(int number : numbers){
            sum = sum + number;
        }*/

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        System.out.println("--------------------");

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());

        System.out.println("--------------------");

        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) ->a+b)
                .get(); // to make integer calTotal, get method is must be used.

        System.out.println(calTotal);

        System.out.println("---or---");

        Optional<Integer> calTotal2 = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b);
                .reduce(Integer:: sum);


        System.out.println(calTotal2.get());

        //Max and Min

        Optional <Integer> min = numbers.stream().reduce(Integer::min);
        Optional <Integer> max = numbers.stream().reduce(Integer::max);
        Optional <Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        //or

        System.out.println("Sum = " + sum.get());
        System.out.println("Max = " + max.get());
        System.out.println("Min = " + min.get());


//COUNT
        System.out.println("-----------COUNT-------------");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);








    }
}
