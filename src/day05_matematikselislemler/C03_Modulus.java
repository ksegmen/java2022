package day05_matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		
		// kullanicidan 3 basamakli bir sayi alip 
		// rakamlar toplamini yazdiran bir program yaziniz 
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		
		
		int sayi=scan.nextInt();
		
		// sayi 573 olsun 
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10; // bana birler basamagini verir 
		
		System.out.println(rakam);
		
		rakamlarToplami+=rakam; // rakamlar tolami 3 oldu 
		
		// sayimiz hala 573
		
		// 3 ten kurtulmak istiyorum cunku 3 le isim bitti 
		// sayiyi 57 haline getirin
		
		sayi/=10;
		
		System.out.println(sayi);
		// sayim artik 57
		// 7 yi nasil alirim 
		
		rakam=sayi%10;
				System.out.println(rakam);
				rakamlarToplami+=rakam;
				
				// sayi hala 57 
				// 7 den de kurtulalim 
				
				sayi/=10;
				// sayi artik 5
				rakamlarToplami+=sayi;
				System.out.println("girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
				
		
		
		
		
		

	}

}
