package com.poc.pattern.creational.builder.impls;

import com.poc.pattern.creational.builder.interfaces.Item;
import com.poc.pattern.creational.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
