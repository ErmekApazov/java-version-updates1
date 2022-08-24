package com.cydeo.AppleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory =new ArrayList<Apple>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        System.out.println("-------forEach()----------");
        inventory.forEach(apple -> System.out.println(apple));

        System.out.println("----------Heavy Apple----------");

        AppleHeavyPredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple = filterApples(inventory, abc);
        System.out.println(heavyApple);

        List<Apple> heavyApple2 = filterApples(inventory, new AppleHeavyPredicate());
            System.out.println(heavyApple2);


        System.out.println("----------Green Apple----------");
        AppleGreenColorPredicate xyz = new AppleGreenColorPredicate();
        List<Apple> greenApple = filterApples(inventory, xyz);
        System.out.println(greenApple);

        List<Apple> greenApple2 = filterApples(inventory, new AppleGreenColorPredicate());
            System.out.println(greenApple2);

        System.out.println("------- Lambda Expression---------");

// lambda:
        ApplePredicate weightApple = (Apple apple) ->apple.getWeight()>200;
        System.out.println(filterApples(inventory, weightApple));

        //or

        ApplePredicate weightApple2 = apple ->apple.getWeight()>200;
        filterApples(inventory, weightApple2);


        System.out.println("------convert to ready functional interfaces--------");


    }


    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
    List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


}
