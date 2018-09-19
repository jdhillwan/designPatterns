package com.poc.pattern.creational.factories;

import com.poc.pattern.creational.factory.interfaces.Color;
import com.poc.pattern.creational.factory.interfaces.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String shape);

	public abstract Color getColor(String color);

}
