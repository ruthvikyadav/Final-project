package com.onlineHealthExample.commandPattern;

public class OrderMedicineCommandMain {
	public static void main(String[] args) {
		OrderStock orderMed1 = new OrderStock("Dolo650", 10);
		OrderStock orderMed2 = new OrderStock("ibuprofenPlus", 20);
		OrderStock orderMed3 = new OrderStock("Crocin500", 70);

		BuyMedicine buy = new BuyMedicine(orderMed1);
		SellMedicine sell = new SellMedicine(orderMed2);
		OutOfStockMedicine outofStock = new OutOfStockMedicine(orderMed3);

		ByPass byPass = new ByPass();
		byPass.takeOrder(buy);
		byPass.takeOrder(sell);
		byPass.takeOrder(outofStock);

		byPass.placeOrders();
	}
}
