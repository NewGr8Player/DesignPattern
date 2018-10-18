package com.xavier.pattern.behavioral.b2.impl;

import com.xavier.pattern.behavioral.b2.abs.Order;

/**
 * 买东西
 *
 * @author NewGr8player
 */
public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
