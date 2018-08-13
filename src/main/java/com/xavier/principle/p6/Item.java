package com.xavier.principle.p6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 商品类
 *
 * @author NewGr8player
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	/**
	 * 商品价格
	 */
	private BigDecimal price;

	/**
	 * 根据购买数量计算价格
	 *
	 * @param num
	 * @return
	 */
	public BigDecimal calcPrice(int num) {
		return this.price.multiply(new BigDecimal(num));
	}
}
