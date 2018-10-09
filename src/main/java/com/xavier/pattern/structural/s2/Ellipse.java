package com.xavier.pattern.structural.s2;

/**
 * 椭圆[Leaf]
 *
 * @author NewGr8Player
 */
public class Ellipse implements Graphic {

	@Override
	public void print() {
		System.out.println("Ellipse@" + this.hashCode());
	}
}