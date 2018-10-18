package com.xavier.pattern.behavioral.b2;

import com.xavier.pattern.behavioral.b2.abs.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 *
 * @author NewGr8Player
 */
public class Broker {

	private List<Order> orderList = new ArrayList<>();

	public void takeOrder(Order order) {
		System.out.println("接受命令：" + order);
		orderList.add(order);
	}

	public void placeOrders() {
		System.out.println("执行命令：");
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
