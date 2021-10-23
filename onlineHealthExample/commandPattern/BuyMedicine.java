package com.onlineHealthExample.commandPattern;

public class BuyMedicine implements Order {
	private OrderStock orderMed;

	public BuyMedicine(OrderStock orderMed) {
		this.orderMed = orderMed;
	}
	@Override
	public void search() {
		orderMed.buy();
	}
}
