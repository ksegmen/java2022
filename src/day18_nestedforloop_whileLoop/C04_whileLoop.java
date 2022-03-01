package day18_nestedforloop_whileLoop;

import java.util.Scanner;

public class C04_whileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici 0 a basincaya kadar sayilari alip 
		// toplamaya devam edin 
		
       // kullanici 0 a bastiginda o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		// kullanicidan 5 sayi alin dese 
		
		for (int i = 1; i <=5; i++) {
			// kullanicidan bir deger alip, toplama eklerim
		}
		
		
		
		
		
		Scanner scan=new Scanner(System.in);   // loop un icinde kullanacagim obje ve variablelari loop dan once olusturmak daha guzldir
		                                        // cunku loop un icinde olusturusak loop her dondugunde yeni bir obje veya variable olusturu
		                                        // bu da hafizayi doldurur
		
		
		int sayi=1;
		int toplam=0;
		int sayac=0;
		
		
		
		while (sayi!=0) {
			
			System.out.println(" lutfen toplama eklemek icin  bir sayi giriniz \n bitirmek icin 0 a basin ");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		}
		
		// kullanici sifira bastiginda loop islevini son kez yapip 
		// sonra basa donecek ve loop bitecek
		// 0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden 
		// sifiri sayac a eklememk icin sayac-1 dedik 49.satirda 
		
		System.out.println("girilen sayi adedi : " + (sayac-1));
		
		System.out.println(" girilen sayilarin toplami :" + toplam );
		
		
		
		
		
		
		
		

	}

}
