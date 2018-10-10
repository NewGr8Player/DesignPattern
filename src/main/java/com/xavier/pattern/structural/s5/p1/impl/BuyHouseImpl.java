package com.xavier.pattern.structural.s5.p1.impl;

import com.xavier.pattern.structural.s5.p1.abs.BuyHouse;

/**
 * 买房子接口实现
 *
 * @author NewGr8Player
 */
public class BuyHouseImpl implements BuyHouse {

	@Override
	public void buyHosue() {
		System.out.println("我要买房");
	}
}