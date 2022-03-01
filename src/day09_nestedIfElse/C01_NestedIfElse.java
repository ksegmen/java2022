package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	   // Kullanicidan bir sifre girmesini isteyin
	   // ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
		//Ilk harf A ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
	   // ilk harf  kucuk harf ise “z” olup olmadigini kontrol edin. 
		//Ilk harf z ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir sifre  giriniz ");
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') { // buyuk harfleri secmis olacak 
			
			if (ilkKarakter=='A') {
				System.out.println("gecerli sifre ");
				
			} else {
				System.out.println("gecersiz sifre ");

			}
			
		} else if(  ilkKarakter>='a' && ilkKarakter<='z'   ) { // kucuk harfleri secer
			
	if (ilkKarakter=='z') {
		System.out.println("gecerli sifre ");
		
	} else {
		System.out.println("gecersiz sifre ");

	}
						
			

		} else { // geriye kalan tum karakterler
			
			
			System.out.println("gecerli sifre olmasi icin harfle baslayiniz ");
		}
		
		
		scan.close();

	}

}
