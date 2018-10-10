package com.xavier.pattern.structural.s5.p1;

import com.xavier.pattern.structural.s5.p1.abs.BuyHouse;

/**
 * 买房代理类
 *
 * @author NewGr8player
 */
public class BuyHouseProxy implements BuyHouse {

	private BuyHouse buyHouse;

	public BuyHouseProxy(final BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}

	@Override
	public void buyHosue() {
		System.out.println("买房前准备");
		buyHouse.buyHosue();
		System.out.println("买房后装修");

	}
}
