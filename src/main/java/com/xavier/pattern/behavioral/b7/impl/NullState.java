package com.xavier.pattern.behavioral.b7.impl;

import com.xavier.pattern.behavioral.b7.abs.DispenserState;

/**
 * 空的状态
 *
 * @author NewGr8player
 */
public class NullState implements DispenserState {

	@Override
	public void press() {
		System.out.println("There is not water poured!");
	}
}
