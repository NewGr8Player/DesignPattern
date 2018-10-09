package com.xavier.pattern.structural.s3;

import com.xavier.pattern.structural.s3.abs.Shape;

/**
 * Shape抽象装饰类
 *
 * @author NewGr8Player
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}
