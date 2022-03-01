package zoomPratik;

import java.util.Scanner;

public class ifSoru7 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi aliniz 
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10   dan   kucuk   ise   ekrana   "Rakam"   yazdiriniz   degilse   "Pozitif   Sayi"
yazdiriniz.
 Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz
		 * 
		 * 
		 */
     

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi girinz");
		
		int a=scan.nextInt();
		
		
		if (a>=0) {
			if (a<10) {
				System.out.println("rakam");
			} else if (a>10) {
				System.out.println("pozitif");

			}{
				
			}
			
		} else {
			System.out.println("negatif");

		}
		
	}

}
