package com.xavier.pattern.structural.s3;

import com.xavier.pattern.structural.s3.abs.Shape;

/**
 * 具体装饰类
 *
 * @author NewGr8Player
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}
