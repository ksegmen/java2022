package pratiklerim;

import java.util.Scanner;

public class C12_halukHcPratik {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
				// 18 yasindan kucuk ise kan bagisi yapamaz
				// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
				// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

				
		Scanner scan=new Scanner(System.in);
		System.out.println("yasinizi ve kilonuzu kg cinsinden giriniz.... ");
       int yas=scan.nextInt();
       double kilo=scan.nextDouble();
       
if  (yas>= 18  && kilo>=50) {
	System.out.println("kan bagisi yapabilirisniz ");
		
	} else if (kilo<50 ) {
		System.out.println("kan bagisi yapamazsiniz  ");
	} else {
System.out.println(" kan bagisi yapamazsiniz ");
	} {

	}
	
	scan.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
