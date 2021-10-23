package com.onlineHealthExample.factoryPattern;

public class BedAvalibility implements Consult {
	@Override
	public void service() {
		System.out.println("Bed is available");
	}
}
