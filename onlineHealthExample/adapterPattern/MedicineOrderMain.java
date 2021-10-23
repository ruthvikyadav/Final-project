package com.onlineHealthExample.adapterPattern;

public class MedicineOrderMain {
	public static void main(String[] args) {
		MedicineConcrete audioPlayer = new MedicineConcrete();

		audioPlayer.orderRet("DOLO", "500");
		audioPlayer.orderRet("CROCIN", "300");
		audioPlayer.orderRet("IBUPROFEN", "10");
		audioPlayer.orderRet("FLUTICON", "12");
	}
}
