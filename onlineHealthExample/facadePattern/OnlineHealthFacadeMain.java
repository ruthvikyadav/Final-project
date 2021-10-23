package com.onlineHealthExample.facadePattern;

public class OnlineHealthFacadeMain {

	public static void main(String[] args) {
		CheckAvalibility avalibility = new CheckAvalibility();

		avalibility.getDoctorAvalibility();
		avalibility.getMedicineAvalibility();
		avalibility.getBedAvalibility();
	}

}
