package com.onlineHealthExample.commandPattern;

public class OrderStock {

	private String MedicineName = "ABC";
	private int quantity = 10;

	public OrderStock(String productName, int quantity) {
		super();
		this.MedicineName = productName;
		this.quantity = quantity;

	}

	public void buy() {
		System.out.println("Stock [ Name: " + MedicineName + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + MedicineName + ", Quantity: " + quantity + " ] sold");
	}

	public void outOfStock() {
		System.out.println("Dear Customer, the medicine " + MedicineName + " is currently unavailable");
	}
}
