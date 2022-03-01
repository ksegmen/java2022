package halukhcodev;

import java.util.Scanner;

public class C09_ScSoru9 {

	public static void main(String[] args) {
		
		
Scanner scan=new Scanner(System.in);
		
		System.out.println(" lutfen uc sayi giriniz, sayilari girdikten sonra enter a basiniz  ");
		 int sayi1=scan.nextInt();
		 int sayi2=scan.nextInt();
		 int sayi3=scan.nextInt();
		 
		System.out.println( "islem sonucu : " + ((sayi1*sayi1-sayi2*sayi2)/sayi3*3 )        );		
		
		scan.close();
		
		

	
	}
	


}