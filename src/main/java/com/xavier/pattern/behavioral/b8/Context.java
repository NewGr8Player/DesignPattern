package com.xavier.pattern.behavioral.b8;

import com.xavier.pattern.behavioral.b8.abs.Strategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 策略内容
 *
 * @author NewGr8player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Context {

	private Strategy strategy;

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
