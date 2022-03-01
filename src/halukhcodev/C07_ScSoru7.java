package halukhcodev;

import java.util.Scanner;

public class C07_ScSoru7 {

	public static void main(String[] args) {
		
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen boyunuzu ve kilonuzu giriniz ");
		double boy=scan.nextDouble();
		double kilo=scan.nextDouble();
		
		System.out.println(" vucut kitle indeksi : " + ( kilo / (boy*boy) ));
		
		
		
		
		
		scan.close();
		

	}

}
