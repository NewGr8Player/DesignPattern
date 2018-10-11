package com.xavier.pattern.structural.s7;

import com.xavier.pattern.structural.s3.abs.Shape;

import java.util.HashMap;

/**
 * 图形工厂类
 *
 * @author NewGr8Player
 */
public class ShapeFactory {

	private static final HashMap<String, Shape> circleMap = new HashMap<>();/* 理解为缓存 */

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
		}
		return circle;
	}
}
