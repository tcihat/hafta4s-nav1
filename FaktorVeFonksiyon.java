package soru;

public class FaktorVeFonksiyon {
	public  int faktoriyel(int sayi) {

		int sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc *= i;
		}
		return sonuc;
	}

	public  int fonksiyon(int sayi) {
		int cevap = (sayi * sayi * sayi) + ((sayi - 3) * (sayi - 3)) + 5;
		return cevap;

	}

	

}
