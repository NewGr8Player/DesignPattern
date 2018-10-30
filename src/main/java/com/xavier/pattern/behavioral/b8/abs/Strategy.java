package com.xavier.pattern.behavioral.b8.abs;

/**
 * 策略接口
 *
 * @author NewGr8Player
 */
public interface Strategy {

	/**
	 * 进行运算
	 *
	 * @param num1
	 * @param num2
	 * @return
	 */
	int doOperation(int num1, int num2);
}
