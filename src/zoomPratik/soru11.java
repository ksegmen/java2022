package zoomPratik;

import java.util.Scanner;

public class soru11 {

	public static void main(String[] args) {
		//Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
		//olanlarini konsola yazdiriniz 
		// ***********************IF YONTEMI ILE COZUM*************
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 tane sayi giriniz. \n her girdiginiz sayidan sonra enter tusuna basiniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double min=0;
		double max=0;
		if (sayi1>sayi2 && sayi1>sayi3) {
			max=sayi1;
			
		} else if (sayi2>sayi1 && sayi2>sayi3) {
			max=sayi2;
			
		} else {
			max=sayi3;
			
			if (sayi1<sayi2 && sayi1<sayi3) {
				min=sayi1;
			}
				else if (sayi2<sayi1 && sayi2<sayi3) {
					min=sayi2;
				}
					else {
						min=sayi3;
					}
				} {
					
				}
			System.out.println("girilen minimum sayi :" + min);
			System.out.println("girilen maximum sayi: " + max);
	}
}
		 

		
		
		
	


