package com.xavier.principle.p5;

import com.xavier.MainTestCase;
import com.xavier.principle.p5.Butler;
import com.xavier.principle.p5.Master;
import org.junit.Test;

/**
 * 最少知识原则测试实例
 *
 * @author NewGr8player
 */
public class LeastKnowledgePrinciple extends MainTestCase {

	@Test
	public void test() {
		Master master = new Master();/* 主人 */

		Butler butler = new Butler();/* 管家 */

		master.cookCommand(butler);/* 主人告诉管家该做饭了 */

		/*
		 *
		 * 这里我们并没有再去雇佣仆人
		 * 所有过程已经都由管家去完成了
		 * */
	}
}
