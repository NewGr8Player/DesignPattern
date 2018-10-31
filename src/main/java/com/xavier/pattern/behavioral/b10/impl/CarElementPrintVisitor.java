package com.xavier.pattern.behavioral.b10.impl;

import com.xavier.pattern.behavioral.b10.abs.CarElementVisitor;

/**
 * 车零件输出访问者实现
 *
 * @author NewGr8Player
 */
public class CarElementPrintVisitor implements CarElementVisitor {

	public CarElementPrintVisitor() {
		System.out.println(this.getClass().getName());
	}

	public void visit(final Body body) {
		System.out.println("Visiting body");
	}

	public void visit(final Car car) {
		System.out.println("Visiting car");
	}

	public void visit(final Engine engine) {
		System.out.println("Visiting engine");
	}

	public void visit(final Wheel wheel) {
		System.out.println("Visiting " + wheel.getName() + " wheel");
	}
}