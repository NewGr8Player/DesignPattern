package com.xavier.pattern.behavioral.b7.impl;

import com.xavier.pattern.behavioral.b7.abs.DispenserState;

/**
 * 满的状态
 *
 * @author NewGr8Player
 */
public class FullState implements DispenserState {

	@Override
	public void press() {
		System.out.println("Water is pouring!");
	}
}
