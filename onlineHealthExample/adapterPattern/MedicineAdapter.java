package com.onlineHealthExample.adapterPattern;

public class MedicineAdapter implements OrderRetail {

	OrderBulk bulk;

	public MedicineAdapter(String medicineName) {

		if (medicineName.equalsIgnoreCase("DOLO")) {
			bulk = new Dolo();

		} else if (medicineName.equalsIgnoreCase("CROCIN")) {
			bulk = new Crocin();
		}
	}

	@Override
	public void orderRet(String medicine, String quantity) {
		if (medicine.equalsIgnoreCase("DOLO")) {
			bulk.orderDolo(quantity);
		} else if (medicine.equalsIgnoreCase("CROCIN")) {
			bulk.orderCrocin(quantity);
		}
	}
}
