package halukhcodev;

import java.util.Scanner;

public class C03_soru3 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki tam sayi giriniz, ilk sayiyi girdikten sonra enter tusuna basiniz ");
		
		double sayi1=scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println(" toplam :" + ( sayi1+sayi2));
		System.out.println( "fark : "  + (sayi1-sayi2));
		System.out.println("carpim : " + (sayi1*sayi2));
		System.out.println("bolum : " + ( sayi1/sayi2));
		
		scan.close();
		

	}

}
