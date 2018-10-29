package com.xavier.pattern.behavioral.b7;

import com.xavier.pattern.behavioral.b7.impl.FullState;
import org.junit.Test;

/**
 * 状态模式测试
 *
 * @author NewGr8PLayer
 */
public class StatePatternTest {

	@Test
	public void test() {
		WaterDispenser dispenser = new WaterDispenser(new FullState());
		for (int i = 0; i < 100; i++) {
			dispenser.press();
		}
	}
}
