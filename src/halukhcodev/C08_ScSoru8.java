package halukhcodev;

import java.util.Scanner;

public class C08_ScSoru8 {

	public static void main(String[] args) {
	
		
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("vize ve final notu giriniz ");
		
		int vize=scan.nextInt();
		int sinav=scan.nextInt();
		System.out.println(" ortalamaniz : " + ((vize*30/100) + (sinav*70/100)));
		
		
		
		
		scan.close();
		
		
		

	}

}
