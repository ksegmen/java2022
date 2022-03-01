package day02_Scanner;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {   
		
		/* Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini  hesaplayip yazdirin 
Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip  prizmanin hacmini hesaplayip yazdirin 
Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin Isminiz : Mehmet 
Soyisminiz : Bulut 
Kursumuza katiliminiz alinmistir,tesekkur ederiz 
Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki  sekilde yazdirin 
Isim � soyisim : Mehmet Bulutluoz 

*/ 
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz: ");
		int sayi1= scan.nextInt();
		
		System.out.println("Lutfen 2.sayiyi giriniz: ");
		int sayi2 =scan.nextInt();
		System.out.println("Sayilarin Toplami: " + (sayi1 + sayi2) );
		System.out.println("sayilarin farki: " + (sayi1-sayi2));
		System.out.println("sayilarin carpimi: " + (sayi1*sayi2));
		
	
		

		

	}

}
