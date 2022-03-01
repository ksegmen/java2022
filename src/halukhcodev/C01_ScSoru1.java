package halukhcodev;

import java.util.Scanner;

public class C01_ScSoru1 {

	public static void main(String[] args) {
		
		/*
    	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
    	 *
    	 */

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String name=scan.next();
				
		
		System.out.println("lutfen soyadinizi giriniz ");
		String surname=scan.next();
		
		System.out.println("lutfen yasinizi giriniz ");
		double yas=scan.nextDouble();
		System.out.println("lutfen boyunuzu giriniz ");
		double boy=scan.nextDouble();
		System.out.println("lutfen kilonuzu giriniz");
		double kilo=scan.nextDouble();
		
		System.out.println("Benim adim : " + name  +"\n"+ "Soyadim : " +surname +"\n"+ "Yasim : " + yas +
                "\n"+"boyum : " + boy +"\n"+"kilom : " + kilo );

		

	}

}
