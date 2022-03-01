package javapracticeday02;

import java.util.Scanner;

public class C05_Soru5 {

	public static void main(String[] args) {
		
        

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" lutfen pozitif bir tamsayi giriniz...");
		int sayi=scan.nextInt();
		if (sayi>=100 && sayi<1000) {
			System.out.println("uc basamakli sayi");
			
		} else if (sayi%2==0) {
			
			System.out.println("uc basamakli olmayan cift sayi");
} else {
	System.out.println("uc basamakli olmayan tek sayi");

		} {

		}
		
		scan.close();
		
		
		

	}

}
