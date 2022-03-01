package day12;

import java.util.Scanner;

public class C07_contains {

	public static void main(String[] args) {
		
		
		
		
		 // Soru 2) Kullanicidan bir cumle isteyin. 
		 //Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
         //  iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen  bir cumle  giriniz ");
		String cumle=scan.nextLine().toLowerCase();
		
		if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
			
			System.out.println("kucuk mu buyuk mu karar verin");
			
			
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		} else if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else {
			System.out.println("cumle buyuk yada kucuk kelimesi icermiyor ");
		} {
			
		}{

		} {
scan.close();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
