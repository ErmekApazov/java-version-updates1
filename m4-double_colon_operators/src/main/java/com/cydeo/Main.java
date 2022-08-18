package com.cydeo;


import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Predicate<Integer> pred = (p)->p%2 ==0 ? true : false;

        // Reference to static method:

        Calculate s1 = (x,y) -> System.out.println(x+y);

        Calculate s2 = (x,y) -> Calculator.findSum(x,y); // instead of using implementation, you can use method

        Calculate s3 = Calculator :: findSum;

        s3.calculate(10,20);

        // Reference to instance method:

        Calculator obj = new Calculator();

        Calculate s4 = obj :: findMultiply; // object call method directly

        Calculate s5 = new Calculator() :: findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> func2 = String :: substring;

        System.out.println("-------------------------");

        Function<Integer, Double> b = new MyClass() :: method; // by creating new object you can call instance method
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;

        System.out.println("---------------------------");

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;






    }

}
