package com.xavier.principle.p6;

import java.math.BigDecimal;

/**
 * 打折商品类
 *
 * @NewGr8Player
 */
public class DiscountItem extends Item {

	/**
	 * 折扣线
	 */
	public static final BigDecimal DCL = new BigDecimal("100.00");

	/**
	 * 85折
	 */
	public static final BigDecimal DC_85 = new BigDecimal("0.85");

	public DiscountItem() {
		super();
	}

	public DiscountItem(BigDecimal price) {
		super(price);
	}

	@Override
	public BigDecimal calcPrice(int num) {
		BigDecimal finalPrice = super.calcPrice(num);
		switch (finalPrice.compareTo(DCL)) {
			case 1:
				return finalPrice.multiply(DC_85);
			case -1:/* 价格不足以打折 */
			case 0:
			default:
				return finalPrice;
		}
	}
}
