package com.onlineHealthExample.adapterPattern;

public class MedicineConcrete implements OrderRetail {
	MedicineAdapter medicineAdapter;

	@Override
	public void orderRet(String medicine, String quantity) {

		if (medicine.equalsIgnoreCase("IBUPROFEN")) {
			System.out.println("Ordered quantity of " + medicine + " is " + quantity);
		}

		else if (medicine.equalsIgnoreCase("DOLO") || medicine.equalsIgnoreCase("CROCIN")) {
			medicineAdapter = new MedicineAdapter(medicine);
			medicineAdapter.orderRet(medicine, quantity);
		}

		else {
			System.out.println("Medicine " + medicine + " is not available");
		}
	}
}
