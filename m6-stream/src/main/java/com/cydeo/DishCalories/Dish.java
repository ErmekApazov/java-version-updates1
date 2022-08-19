package com.cydeo.DishCalories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter

public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;
}