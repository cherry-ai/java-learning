package com.cherry.pattern.builder;

public class SubMealBuilderB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("SubMealBuilderB buildFood!");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("SubMealBuilderB buildDrink!");
    }

}