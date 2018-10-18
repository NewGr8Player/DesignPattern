package com.xavier.pattern.behavioral.b3.abs;

import java.util.Map;

/**
 * 表达式接口
 *
 * @author NewGr8Player
 */
public interface Expression {

	/**
	 * 解析表达式
	 *
	 * @param variables
	 * @return
	 */
	int interpret(Map<String, Expression> variables);
}
