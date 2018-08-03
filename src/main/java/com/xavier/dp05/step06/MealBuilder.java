package com.xavier.dp05.step06;

import com.xavier.dp05.step04.ChickenBurger;
import com.xavier.dp05.step04.Coke;
import com.xavier.dp05.step04.Pepsi;
import com.xavier.dp05.step04.VegBurger;
import com.xavier.dp05.step05.Meal;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
