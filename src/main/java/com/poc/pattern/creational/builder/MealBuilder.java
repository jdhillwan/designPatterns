package com.poc.pattern.creational.builder;

import com.poc.pattern.creational.builder.impls.ChickenBurger;
import com.poc.pattern.creational.builder.impls.Coke;
import com.poc.pattern.creational.builder.impls.Meal;
import com.poc.pattern.creational.builder.impls.Pepsi;
import com.poc.pattern.creational.builder.impls.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
