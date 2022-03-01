package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// kullanicidan isim ve soyismini ayri ayri isteyip 
		//girilen ismi asagidaki gibi yazdiriniz 
		// girilen isim: Mehmet Bulutluoz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println(" lutfen soyisminizi giriniz...");
		
		String soyisim=scan.next();
		System.out.println("girilen isim : "+ isim + " " + soyisim );
		
		
		

	}

}
