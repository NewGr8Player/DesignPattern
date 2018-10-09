package com.xavier.pattern.structural.s4;

import com.xavier.pattern.structural.s3.abs.Shape;
import com.xavier.pattern.structural.s3.impl.Circle;
import com.xavier.pattern.structural.s3.impl.Rectangle;

/**
 * 这里使用了s3中的图形接口与实现类
 *
 * @author NewGr8Player
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
	}


	/**
	 * 画圆形
	 */
	public void drawCircle() {
		circle.draw();
	}

	/**
	 * 画长方形
	 */
	public void drawRectangle() {
		rectangle.draw();
	}
}
