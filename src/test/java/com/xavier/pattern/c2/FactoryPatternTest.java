package com.xavier.pattern.c2;

import com.xavier.MainTestCase;
import com.xavier.pattern.creational.c2.abs.AbstractHumanFactory;
import com.xavier.pattern.creational.c2.abs.Human;
import com.xavier.pattern.creational.c2.impl.BlackHuman;
import com.xavier.pattern.creational.c2.impl.HumanFactory;
import com.xavier.pattern.creational.c2.impl.WhiteHuman;
import com.xavier.pattern.creational.c2.impl.YellowHuman;
import org.junit.Test;

/**
 * 工厂类测试
 *
 * @author NewGr8Player
 */
public class FactoryPatternTest extends MainTestCase {

	@Test
	public void test() {
		/* 人类工厂 */
		AbstractHumanFactory humanFactory = new HumanFactory();

		/* 白色人种 */
		Human whitehuman = humanFactory.createHuman(WhiteHuman.class);
		System.out.println(whitehuman.getSkinColor());
		System.out.println(whitehuman.say());

		/* 黑色人种 */
		Human blackhuman = humanFactory.createHuman(BlackHuman.class);
		System.out.println(blackhuman.getSkinColor());
		System.out.println(blackhuman.say());

		/* 黄色人种 */
		Human yellowhuman = humanFactory.createHuman(YellowHuman.class);
		System.out.println(yellowhuman.getSkinColor());
		System.out.println(yellowhuman.say());
	}
}
