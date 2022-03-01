package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// scanner isleminde string icin iki method vardir 
		// scan.next dedigimizde sadece bir kelime alir( ilk space e kadar) 
		// eger kullanicidan daha fazla kelime gelme ihtimali varsa 
		// scan.nextLine() kullanmaliyiz 
		
		// kullanicidan isim ve soyismini ayri ayri isteyip 
				//girilen ismi asagidaki gibi yazdiriniz 
				// girilen isim: Mehmet Bulutluoz
				
				Scanner scan= new Scanner(System.in);
				
				System.out.println("lutfen isminizi giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println(" lutfen soyisminizi giriniz...");
				
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim : "+ isim + " " + soyisim );

	}

}
