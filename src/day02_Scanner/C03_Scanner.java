package day02_Scanner;

import java.util.Scanner;

public class C03_Scanner {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yaricapi giriniz: ");
		int sayi1=scan.nextInt();
		int sayi2= 2;
		float sayi3=(float) 3.14;
		
		
		System.out.println("cemberin cevresi: " + (sayi1* sayi2*sayi3));
		System.out.println("dairenin alani: " + ( sayi3*sayi1*sayi1));
		

	}

}
