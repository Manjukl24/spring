package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("square")
	Shape shape;
	
	public Shape getShape1() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void printArea(int x, int y) {
		
		System.out.print("Calculating Area");
		System.out.println(shape.calcArea(x, y));

	}
	public Shape getShape() {
		// TODO Auto-generated method stub
		return null;
	}
}