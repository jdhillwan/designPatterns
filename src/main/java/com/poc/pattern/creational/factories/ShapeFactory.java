package com.poc.pattern.creational.factories;

import com.poc.pattern.creational.factory.impls.Circle;
import com.poc.pattern.creational.factory.impls.Rectangle;
import com.poc.pattern.creational.factory.impls.Square;
import com.poc.pattern.creational.factory.interfaces.Color;
import com.poc.pattern.creational.factory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		
		if(shapeType==null) {
			return null;
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
