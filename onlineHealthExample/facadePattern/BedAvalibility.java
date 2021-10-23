package com.onlineHealthExample.facadePattern;

public class BedAvalibility implements Consult {
	@Override
	public void service() {
		System.out.println("Bed is available");
	}
}
