package com.xavier.pattern.structural.s3.impl;

import com.xavier.pattern.structural.s3.abs.Shape;

/**
 * 长方形
 *
 * @author NewGr8Player
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
