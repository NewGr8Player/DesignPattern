package com.xavier.pattern.behavioral.b3.impl;

import com.xavier.pattern.behavioral.b3.abs.Expression;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 表达式解析
 *
 * @author NewGr8Player
 */
public class Evaluator implements Expression {
	private Expression syntaxTree;

	public Evaluator(String expression) {
		Queue<Expression> expressionStack = new LinkedList<>();
		for (String token : expression.split(" ")) {
			if (token.equals("+")) {
				Expression subExpression = new Plus(expressionStack.poll(), expressionStack.poll());
				expressionStack.offer(subExpression);
			} else if (token.equals("-")) {
				Expression left = expressionStack.poll();
				Expression right = expressionStack.poll();
				Expression subExpression = new Minus(left, right);
				expressionStack.offer(subExpression);
			} else
				expressionStack.offer(new Variable(token));
		}
		syntaxTree = expressionStack.poll();
	}

	public int interpret(Map<String, Expression> context) {
		return syntaxTree.interpret(context);
	}
}