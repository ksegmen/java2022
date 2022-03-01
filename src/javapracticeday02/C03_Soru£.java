package javapracticeday02;

import java.util.Scanner;

public class C03_Soru£ {

	public static void main(String[] args) {
		
		
		
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("boyunuzu cm olarak giriniz ");
         System.out.println("kilonuzu kg olarak giriniz ");
         int boy=scan.nextInt();
         int kilo=scan.nextInt();
         int bmi=kilo/(boy/100*boy/100);
         if (bmi<=20) {
        	 System.out.println("oldukca zayifsiniz");
			
		} else if (bmi<= 25) {
			System.out.println("normal sinirdasiniz ");
			
		} else if (bmi<=30) {
			System.out.println("sisman kategorisindesiniz");
			
		} else if (30<bmi) {
			System.out.println("obez grubundasiniz ");
			
		} else {
			
			System.out.println(" gecersiz veri girdiniz...");

		} {
			
			

		}{

		}{

		}
         
		
		
		

	}

}
