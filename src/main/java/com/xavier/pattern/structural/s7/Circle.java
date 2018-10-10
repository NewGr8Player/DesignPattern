package com.xavier.pattern.structural.s7;

import com.xavier.pattern.structural.s3.abs.Shape;
import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

/**
 * 圆形
 *
 * @author NewGr8Player
 */
@Getter
@Setter
public class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Circle.class.getSimpleName() + "[", "]")
				.add("color='" + color + "'")
				.add("x=" + x)
				.add("y=" + y)
				.add("radius=" + radius)
				.toString();
	}
}
