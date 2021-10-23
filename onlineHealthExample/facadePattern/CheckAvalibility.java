package com.onlineHealthExample.facadePattern;

public class CheckAvalibility {

	private Consult doctorAvalibility;
	private Consult medicineAvalibility;
	private Consult bedAvalibility;

	public CheckAvalibility() {
		doctorAvalibility = new DoctorAvalibility();
		medicineAvalibility = new MedicineAvalibility();
		bedAvalibility = new BedAvalibility();
	}

	public void getDoctorAvalibility() {
		doctorAvalibility.service();
	}

	public void getMedicineAvalibility() {
		medicineAvalibility.service();
	}

	public void getBedAvalibility() {
		bedAvalibility.service();
	}
}
