package com.onlineHealthExample.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class ByPass {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.search();
		}
		orderList.clear();
	}
}
