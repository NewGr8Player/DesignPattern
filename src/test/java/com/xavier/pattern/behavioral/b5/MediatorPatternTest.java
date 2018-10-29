package com.xavier.pattern.behavioral.b5;

import com.xavier.MainTestCase;
import org.junit.Test;

/**
 * 中介者模式测试
 *
 * @author NewGr8Player
 */
public class MediatorPatternTest extends MainTestCase {

	@Test
	public void test() {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
