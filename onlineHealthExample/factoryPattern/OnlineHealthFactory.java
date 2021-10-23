package com.onlineHealthExample.factoryPattern;

public class OnlineHealthFactory {

	public static void main(String[] args) {
		CheckAvalibility check = new CheckAvalibility();
		Consult shape1 = check.getConsultation("DOCTOR");
		shape1.service();
		Consult shape2 = check.getConsultation("MEDICINE");
		shape2.service();
		Consult shape3 = check.getConsultation("BED");
		shape3.service();
	}

}
