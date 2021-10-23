package com.onlineHealthExample.adapterPattern;

public class Dolo implements OrderBulk {

	@Override
	public void orderDolo(String quantity) {
		System.out.println("Order of Bulk Dolo placed successfully. Quantity - " + quantity);
	}

	@Override
	public void orderCrocin(String quantity) {

	}
}
