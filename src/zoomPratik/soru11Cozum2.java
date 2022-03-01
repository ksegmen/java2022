package zoomPratik;

import java.util.Arrays;
import java.util.Scanner;

public class soru11Cozum2 {

	public static void main(String[] args) {
		//Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
	//	olanlarini konsola yazdiriniz 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen  araya bosluk birakarak 3 tane sayi giriniz.");
		
		String sayi=scan.nextLine();
		String arr[]=sayi.split(" ");
		Arrays.sort(arr);
		
		System.out.println("girilen en kucuk sayi :" + arr[0]);
		
		System.out.println("girilen en buyuk sayi : " + arr[arr.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
