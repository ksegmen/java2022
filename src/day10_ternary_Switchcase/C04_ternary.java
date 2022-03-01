package day10_ternary_Switchcase;

import java.util.Scanner;

public class C04_ternary {

	public static void main(String[] args) {
		// Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz ");
	
		double sayi=scan.nextDouble();
		
	// ternary ile direk sonuc veya sonuc dondurecek bir islem yapabiliriz 
		
	     System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi);
		
		

	}

}
