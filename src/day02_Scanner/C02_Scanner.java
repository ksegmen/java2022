package day02_Scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz: ");
		int sayi1= scan.nextInt();
		
		System.out.println("karenin cevresi: " + (sayi1*4));
		System.out.println("karenin alani: " + (sayi1*sayi1));
		
	   
	 
	

	}

}
