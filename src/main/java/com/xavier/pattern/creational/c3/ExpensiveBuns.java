package com.xavier.pattern.creational.c3;

import com.xavier.pattern.creational.c3.impl.BreakfastShop;

/**
 * 超级贵的包子
 *
 * @author NewGr8player
 */
public class ExpensiveBuns extends BreakfastShop {

	@Override
	public void sell() {
		System.out.println("这个包子100块...");
	}
}
