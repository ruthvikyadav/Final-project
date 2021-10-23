package com.onlineHealthExample.commandPattern;

public class SellMedicine implements Order {
	private OrderStock orderMed;

	public SellMedicine(OrderStock orderMed) {
		this.orderMed = orderMed;
	}

	@Override
	public void search() {
		orderMed.sell();
	}
}
