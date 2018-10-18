package com.xavier.pattern.behavioral.b2.impl;

import lombok.*;

/**
 * 买卖请求类
 *
 * @author NewGr8Player
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

	private String name;
	private int quantity;

	public void buy() {
		System.out.println("Bought_" + this);
	}

	public void sell() {
		System.out.println("Sold_" + this);
	}
}
