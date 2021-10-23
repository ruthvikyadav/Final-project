package com.onlineHealthExample.adapterPattern;

public class Crocin implements OrderBulk {
	@Override
	public void orderDolo(String quantity) {

	}

	@Override
	public void orderCrocin(String quantity) {
		System.out.println("Order of Bulk Crocin placed successfully. Quantity - " + quantity);
	}
}
