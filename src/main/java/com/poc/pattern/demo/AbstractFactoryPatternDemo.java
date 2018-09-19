package com.poc.pattern.demo;

import com.poc.pattern.creational.factories.AbstractFactory;
import com.poc.pattern.creational.factories.FactoryProducer;
import com.poc.pattern.creational.factory.interfaces.Color;
import com.poc.pattern.creational.factory.interfaces.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape circleShape = shapeFactory.getShape("CIRCLE");
		circleShape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color redColor = colorFactory.getColor("RED");
		redColor.fill();

	}
}
