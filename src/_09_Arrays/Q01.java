package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
		public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);
			System.out.println("lutfen array e eklemek icin eleman sayisi giriniz ");
			int sayi=scan.nextInt();
			System.out.println("lutfen ekleyeceginzi sayilari yaziniz ");
			
			int dizi[]=new int[sayi];
	for (int i = 0; i < dizi.length; i++) {
				dizi[i]=scan.nextInt();
		
				System.out.print(dizi[i]+" ");
				
			}
	   System.out.println(" ");
			
	System.out.println(Arrays.toString(dizi));

		Arrays.sort(dizi);

	    int fark=(dizi[dizi.length-1])-(dizi[0]);

			System.out.println("iki sayinin farki :" + fark);
			 
		}
	
​

		
		
}
}
	

	
