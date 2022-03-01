package halukhcodev;

import java.util.Scanner;

public class C04_ScSoru4 {

	public static void main(String[] args) {

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 5 basamakli bir sayi giriniz..");
		
		int sayi=scan.nextInt();
		
		
	
		System.out.println("sonuc: " +  (sayi/10000+ sayi/1000%10 + sayi%10 +sayi/10%10 ));
		
		
		
		
		
		
		
		scan.close();
		
		
		
	}

}
