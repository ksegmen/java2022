package pratiklerim;

import java.util.Scanner;

public class C21_halukHc {

	public static void main(String[] args) {
		
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
    
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tane tam sayi giriniz ..");
		double sayi=scan.nextDouble();
		
		
		double sonuc= (sayi>0 ? sayi : -(sayi));
		System.out.println( "girdiginiz sayinin mutlak degeri :" + sonuc);
		
		
		scan.close();
		
		
	}

}
