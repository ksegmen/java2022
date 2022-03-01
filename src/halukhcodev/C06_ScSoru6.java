package halukhcodev;

import java.util.Scanner;

public class C06_ScSoru6 {

	public static void main(String[] args) {
		// mesafe hiz zaman sorusu 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen mesafeyi ve ortalama hizi giriniz..");
		
		double mesafe=scan.nextDouble();
		double hiz=scan.nextDouble();
		System.out.println("zaman : " + (mesafe/hiz) + " km/saat");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}
