package com.onlineHealthExample.facadePattern;

public class MedicineAvalibility implements Consult {

	@Override
	public void service() {
		System.out.println("Medicine is available");
	}
}
