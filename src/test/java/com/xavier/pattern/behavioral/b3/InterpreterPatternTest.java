package com.xavier.pattern.behavioral.b3;

import com.xavier.MainTestCase;
import com.xavier.pattern.behavioral.b3.abs.Expression;
import com.xavier.pattern.behavioral.b3.impl.Evaluator;
import com.xavier.pattern.behavioral.b3.impl.Number;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式测试
 *
 * @author NewGr8Player
 */
public class InterpreterPatternTest extends MainTestCase {

	@Test
	public void test() {
		String expression = "w x - z +";
		Evaluator sentence = new Evaluator(expression);
		Map<String, Expression> variables = new HashMap<>();
		variables.put("w", new Number(1));
		variables.put("x", new Number(2));
		variables.put("z", new Number(3));
		int result = sentence.interpret(variables);
		System.out.println(result);
	}
}
