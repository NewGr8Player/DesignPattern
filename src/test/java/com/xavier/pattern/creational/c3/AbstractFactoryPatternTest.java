package com.xavier.pattern.creational.c3;

import com.xavier.MainTestCase;
import com.xavier.pattern.creational.c3.abs.Breakfast;
import com.xavier.pattern.creational.c3.abs.BreakfastFactory;
import com.xavier.pattern.creational.c3.impl.AdvBreakfastFactory;
import com.xavier.pattern.creational.c3.impl.LowBreakfastFactory;
import org.junit.Test;

/**
 * 抽象工厂类测试
 *
 * @author NewGr8Player
 */
public class AbstractFactoryPatternTest extends MainTestCase {

	@Test
	public void test(){
		// 进入高级早餐店买一个包子
		BreakfastFactory breakfastFactory = new AdvBreakfastFactory();
		Breakfast breakfast = breakfastFactory.sellBuns();
		breakfast.sell();

		// 去低级早餐店买一包豆浆
		BreakfastFactory breakfastFactory2 = new LowBreakfastFactory();
		Breakfast breakfast2 = breakfastFactory2.sellSoyMilk();
		breakfast2.sell();
	}
}
