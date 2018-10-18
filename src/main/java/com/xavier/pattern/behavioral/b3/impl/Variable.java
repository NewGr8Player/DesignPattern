package com.xavier.pattern.behavioral.b3.impl;

import com.xavier.pattern.behavioral.b3.abs.Expression;
import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 变量
 *
 * @author NewGr8Player
 */
@AllArgsConstructor
public class Variable implements Expression {

	/**
	 * 变量名
	 */
	private String name;

	public int interpret(final Map<String, Expression> variables) {
		if (null == variables.get(name)) {
			return 0;
		} else {
			return variables.get(name).interpret(variables);
		}
	}
}
