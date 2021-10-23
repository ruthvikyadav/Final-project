package com.onlineHealthExample.commandPattern;

public class OutOfStockMedicine implements Order {
	private OrderStock orderMed;

	public OutOfStockMedicine(OrderStock orderMed) {
		this.orderMed = orderMed;
	}

	@Override
	public void search() {
		orderMed.outOfStock();
	}
}
