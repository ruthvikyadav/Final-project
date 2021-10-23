package com.onlineHealthExample.factoryPattern;

public class CheckAvalibility {
	public Consult getConsultation(String query) {
		if (query == null) {
			return null;
		}
		if (query.equalsIgnoreCase("DOCTOR")) {
			return new DoctorAvalibility();

		} else if (query.equalsIgnoreCase("MEDICINE")) {
			return new MedicineAvalibility();

		} else if (query.equalsIgnoreCase("BED")) {
			return new BedAvalibility();
		}

		return null;
	}
}
