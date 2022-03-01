package practice22Kasim;

import java.util.Scanner;

public class C06_soru9 {

	public static void main(String[] args) {
		
	//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen pin giriniz");
		int userPin=scan.nextInt();
		
		
		
		int systemPin=1453;
		
		while (userPin!=systemPin){
			System.out.println("yanlis pin girdiniz");
			System.out.println("lutfen tekrar deneyiniz");
			userPin=scan.nextInt();
		}
		System.out.println("basarili pin girdiniz");
	}

}
