package day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uzun kenari giriniz: ");
		int sayi1= scan.nextInt();
		
		System.out.println("lutfen kisa kenari giriniz: ");
		int sayi2=scan.nextInt();
		System.out.println("lutfen yuksekligi giriniz: ");
		int sayi3=scan.nextInt();
		System.out.println("prizmanin hacmi: " + (sayi1*sayi2*sayi3));
		
		

	}

}
