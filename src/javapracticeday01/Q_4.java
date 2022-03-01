package javapracticeday01;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		
// kullanicidan iki tam sayi alip bu iki tamsayinin 4 islem sonucunu yazdiriniz 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("birinci sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int sayi2=scan.nextInt();
		System.out.println("sayilarin toplami:"+ (sayi1+sayi2));
		System.out.println("sayilarin farki:"+ (sayi1-sayi2));
		System.out.println("sayilarin carpimi:"+ (sayi1*sayi2));
		System.out.println("sayilarin bolumu:"+ (sayi1/sayi2));
		scan.close();
		
	}

}
