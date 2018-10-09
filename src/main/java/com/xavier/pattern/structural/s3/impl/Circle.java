package com.xavier.pattern.structural.s3.impl;

import com.xavier.pattern.structural.s3.abs.Shape;

/**
 * 圆形
 *
 * @author NewGr8player
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
