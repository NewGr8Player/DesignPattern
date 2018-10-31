package com.xavier.pattern.behavioral.b10.impl;

import com.xavier.pattern.behavioral.b10.abs.CarElementVisitor;

/**
 * 零部件访问者实现
 *
 * @author NewGr8Player
 */
public class CarElementDoVisitor implements CarElementVisitor {

	public CarElementDoVisitor() {
		System.out.println(this.getClass().getName());
	}

	public void visit(final Body body) {
		System.out.println("Moving my body");
	}

	public void visit(final Car car) {
		System.out.println("Starting my car");
	}

	public void visit(final Wheel wheel) {
		System.out.println("Kicking my " + wheel.getName() + " wheel");
	}

	public void visit(final Engine engine) {
		System.out.println("Starting my engine");
	}
}
