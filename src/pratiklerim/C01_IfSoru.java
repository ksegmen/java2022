package pratiklerim;

import java.util.Scanner;

public class C01_IfSoru {

	public static void main(String[] args) {
		// 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir tam sayi giriniz ");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir");
			
		} else {
			System.out.println("girdiginiz sayi tek sayi");

		}
scan.close();


	}

}
