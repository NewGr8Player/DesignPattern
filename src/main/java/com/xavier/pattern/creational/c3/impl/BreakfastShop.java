package com.xavier.pattern.creational.c3.impl;

import com.xavier.pattern.creational.c3.abs.Breakfast;

/**
 * 早餐店，所有早餐的父类
 *
 * @author NewGr8Player
 */
public class BreakfastShop implements Breakfast {
	@Override
	public void sell() {
		System.out.println("卖早餐了...");
	}
}
