package com.xavier.pattern.behavioral.b3.impl;

import com.xavier.pattern.behavioral.b3.abs.Expression;
import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 数值类
 *
 * @author NewGr8Player
 */
@AllArgsConstructor
public class Number implements Expression {

	/**
	 * 数值
	 */
	private int number;

	/**
	 * 解析数值
	 *
	 * @param variables
	 * @return
	 */
	public int interpret(Map<String, Expression> variables) {
		return number;
	}
}
