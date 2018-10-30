package com.xavier.pattern.behavioral.b8.impl;

import com.xavier.pattern.behavioral.b8.abs.Strategy;

/**
 * 减法运算
 *
 * @author NewGr8PLayer
 */
public class OperationSubstract implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
