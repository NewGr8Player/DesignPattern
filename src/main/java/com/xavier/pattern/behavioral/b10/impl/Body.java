package com.xavier.pattern.behavioral.b10.impl;

import com.xavier.pattern.behavioral.b10.abs.CarElement;
import com.xavier.pattern.behavioral.b10.abs.CarElementVisitor;

/**
 * 车身
 *
 * @author NewGr8Player
 */
public class Body implements CarElement {

	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}
}