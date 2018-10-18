package com.xavier.pattern.behavioral.b2.impl;

import com.xavier.pattern.behavioral.b2.abs.Order;

/**
 * 卖东西
 *
 * @ahtuor NewGr8Player
 */
public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
