package com.onlineHealthExample.facadePattern;

public class DoctorAvalibility implements Consult {
	@Override
	public void service() {
		System.out.println("Doctor is available");
	}
}
