package com.xavier.pattern.behavioral.b3.impl;

import com.xavier.pattern.behavioral.b3.abs.Arithmetic;
import com.xavier.pattern.behavioral.b3.abs.Expression;

import java.util.Map;

/**
 * 减法法表达式
 *
 * @author NewGr8Player
 */
public class Minus extends Arithmetic implements Expression {

	public Minus(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}
}

