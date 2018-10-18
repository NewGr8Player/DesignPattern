package com.xavier.pattern.behavioral.b2;

import com.xavier.MainTestCase;
import com.xavier.pattern.behavioral.b2.impl.BuyStock;
import com.xavier.pattern.behavioral.b2.impl.SellStock;
import com.xavier.pattern.behavioral.b2.impl.Stock;
import org.junit.Test;

public class CommandPatternTest extends MainTestCase {

	@Test
	public void test() {
		Stock abcStock = new Stock("ABC",999);

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
