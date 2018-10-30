package com.xavier.pattern.behavioral.b8;

import com.xavier.MainTestCase;
import com.xavier.pattern.behavioral.b8.impl.OperationAdd;
import com.xavier.pattern.behavioral.b8.impl.OperationMultiply;
import com.xavier.pattern.behavioral.b8.impl.OperationSubstract;
import org.junit.Test;

/**
 * 策略模式测试
 *
 * @author NewGr8Player
 */
public class StrategyPatternTest extends MainTestCase {

	@Test
	public void test() {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
