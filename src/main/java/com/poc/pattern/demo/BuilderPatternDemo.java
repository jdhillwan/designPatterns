package com.poc.pattern.demo;

import com.poc.pattern.creational.builder.MealBuilder;
import com.poc.pattern.creational.builder.impls.Meal;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println(vegMeal.getCost());
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println(nonVegMeal.getCost());
	}

}
