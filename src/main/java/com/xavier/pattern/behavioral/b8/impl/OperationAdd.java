package com.xavier.pattern.behavioral.b8.impl;

import com.xavier.pattern.behavioral.b8.abs.Strategy;

/**
 * 加法运算
 *
 * @author NewGr8Player
 */
public class OperationAdd implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}
