package javapracticeday02;

import java.util.Scanner;

public class C02_Soru2 {

	public static void main(String[] args) {
		
		
		
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" lutfen iki sayi giriniz...");
		System.out.println("toplama icin 1 \n cikarma icin 2 \n carpma icin 3 \n bolme icin 4 giriniz ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		int islem=scan.nextInt();
		
		if (islem==1 ) {
			System.out.println(  "girdiginiz sayilarin toplami : "  +  (sayi1+sayi2));
			
			
		} else if (islem==2) {
			System.out.println(   "girdiginiz sayilarin farki : "     +        (sayi1-sayi2));
			
		} else if (islem==3) {
			System.out.println(      "girdiginiz sayilarin carpimi : "          +                    (sayi1*sayi2));
		} else if (islem==4) {
			System.out.println(           "girdiginiz sayilarin bolumu : "       +                   (sayi1/sayi2));
			
		} else {
			System.out.println("gecersiz islem girdiniz ");

		}{

		}{

		} {

		}
		
		
		


	}

}
