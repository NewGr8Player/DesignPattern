package com.xavier.pattern.behavioral.b3.abs;

import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 运算抽象类
 *
 * @author NewGr8Player
 */
@AllArgsConstructor
public abstract class Arithmetic {

	/**
	 * 左操作数
	 */
	protected Expression leftOperand;

	/**
	 * 右操作数
	 */
	protected Expression rightOperand;

	/**
	 * 解析运算表达式
	 *
	 * @param variables
	 * @return
	 */
	public abstract int interpret(Map<String, Expression> variables);
}
