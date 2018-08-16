package com.xavier.principle.p6;

import com.xavier.MainTestCase;
import com.xavier.principle.p6.DiscountItem;
import com.xavier.principle.p6.Item;
import org.junit.Test;

import java.math.BigDecimal;

public class OpenClosedPrinciple extends MainTestCase {

	@Test
	public void test() {
		BigDecimal price = new BigDecimal("10.00");

		Item item = new Item(price);
		System.out.println(item.calcPrice(50));

		DiscountItem discountItem = new DiscountItem(price);
		System.out.println(discountItem.calcPrice(50));
	}
}
