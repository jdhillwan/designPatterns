package com.poc.pattern.creational.builder.impls;

import java.util.ArrayList;
import java.util.List;

import com.poc.pattern.creational.builder.interfaces.Item;

public class Meal {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}

	public float getCost() {
		float cost = 0;
		for (Item obj : items) {
			cost += obj.price();
		}
		return cost;

	}
	
	public void showItems() {
		items.forEach(p -> {
			System.out.println("item : "+p.name());
			System.out.println("price : "+p.price());
			System.out.println("packing : "+p.packing().pack());
		});
	}
}
