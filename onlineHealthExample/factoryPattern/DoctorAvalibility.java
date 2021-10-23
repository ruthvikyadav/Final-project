package com.onlineHealthExample.factoryPattern;

public class DoctorAvalibility implements Consult {
	@Override
	public void service() {
		System.out.println("Doctor is available");
	}
}
