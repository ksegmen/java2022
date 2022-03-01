package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		
		
		     // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		     //eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
		      //Diger durumlarda ekrana “Eskenar degil” yazdirin.
		     
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen kenar uzunluklzrini yaziniz \n ilk kenari girdikten sonra diger kenarlar icin enter a basin");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("ucgeniniz eskenardir ");
			
			
		} else {
System.out.println("ucgeniniz eskenar degildir ");
           // kenar1==kenar2==kenar3 yazamayiz java iki karsilastirma yapabilir sadece 
         scan.close();
		}
		
		


	}

}
