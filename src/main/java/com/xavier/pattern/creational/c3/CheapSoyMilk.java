package com.xavier.pattern.creational.c3;

import com.xavier.pattern.creational.c3.impl.BreakfastShop;

/**
 * 便宜的豆浆
 *
 * @author NewGr8Player
 */
public class CheapSoyMilk extends BreakfastShop {

	@Override
	public void sell() {
		System.out.println("这个豆浆要2块...");
	}
}
