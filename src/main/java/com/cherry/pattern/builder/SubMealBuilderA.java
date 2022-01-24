package com.cherry.pattern.builder;

public class SubMealBuilderA extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("SubMealBuilderA buildFood");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("SubMealBuilderA buildDrink");
    }
}