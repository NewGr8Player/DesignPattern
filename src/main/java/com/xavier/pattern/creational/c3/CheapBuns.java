package com.xavier.pattern.creational.c3;

import com.xavier.pattern.creational.c3.impl.BreakfastShop;

/**
 * 便宜的包子
 *
 * @author NewGr8player
 */
public class CheapBuns extends BreakfastShop {

	@Override
	public void sell() {
		System.out.println("这个包子1块...");
	}
}
