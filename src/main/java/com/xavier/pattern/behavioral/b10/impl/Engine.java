package com.xavier.pattern.behavioral.b10.impl;

import com.xavier.pattern.behavioral.b10.abs.CarElement;
import com.xavier.pattern.behavioral.b10.abs.CarElementVisitor;

/**
 * 引擎
 *
 * @author NewGr8Player
 */
public class Engine implements CarElement {

	@Override
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
