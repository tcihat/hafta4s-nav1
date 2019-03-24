package soru;

import java.util.Random;

public class Soru1 {


	public static void main(String[] args) {

		FaktorVeFonksiyon Nesne= new FaktorVeFonksiyon();
		
		Random rnd = new Random();
		int IslemSayisi = rnd.nextInt(10);
		System.out.println("iþlem sayisi " + IslemSayisi + " kez tekrarlanacak");
		
		for (int i = 0; i < IslemSayisi; i++) {
			int islem_turu = rnd.nextInt(2);
			System.out.println();
			switch (islem_turu) {
			case 0:
				int sayi1 = rnd.nextInt(10);
				System.out.println("faktoriyeli alýnacak sayi : " + sayi1);

				int sonuc1 = Nesne.faktoriyel(sayi1);
				System.out.println(sonuc1);
				break;

			case 1:

				int sayi2 = rnd.nextInt(10);
				System.out.println("foknsyona girecek sayi : " + sayi2);
				int sonuc2 = Nesne.fonksiyon(sayi2);
				System.out.println(sonuc2);

				break;

			}
		}
	}
}
