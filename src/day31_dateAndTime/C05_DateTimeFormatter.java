package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		System.out.println(tarihSaat); //2021-12-02T20:44:43.743481200
		// eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek 
		// gun/ay/yil saat:dakika
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / MM / YYYY  EEE    HH : mm");
		System.out.println(duzenle.format(tarihSaat));
		
		
	/* 
		format olusturuken 
		GUN
		d: basta 0 varsa onu yazmadan gun numarasi
		dd: tek haneli gunleri 01 gibi basina 0 yazarak gun numarasi 
		E,EE,EEE: gun isminin ilk 3 harfi
		EEEE: gun isminin tamamini yazar
		DDD: yilin kacinci gunu oldugunu yazar 
		
		AY(ay icin M dakika icin m kullanilir)
		M: basta 0 varsa onu yazmadan ay numarasi
		MM: tek haneli aylari 01 gibi sifir yazarak ay numarasi
		MMM ay isminin ilk 3 harfi 
		MMMM ay isminin tamami 
		
		YIL
		YY yilin son iki rakamini yazar 
		YYYY yilin 4 rakamini yazar 
		
		
		
		Saat: (24 saat uzerinden istiyorsak H,12 saat uzerinden istiyorsak h)
		HH saatin tamami
		H tek rakamli saat olursa sadece saati
		 a yazarsak AM veya PM yazar
		 
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
		
		
		
		
		
	}

}
