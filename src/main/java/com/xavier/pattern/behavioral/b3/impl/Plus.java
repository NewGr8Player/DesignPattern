package com.xavier.pattern.behavioral.b3.impl;

import com.xavier.pattern.behavioral.b3.abs.Arithmetic;
import com.xavier.pattern.behavioral.b3.abs.Expression;

import java.util.Map;

/**
 * 加法表达式
 *
 * @author NewGr8Player
 */
public class Plus extends Arithmetic implements Expression {

	public Plus(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	/**
	 * 解析加法运算表达式
	 *
	 * @param variables
	 * @return
	 */
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) + rightOperand.interpret(variables);
	}
}