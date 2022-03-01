package pratiklerim;

import java.util.Scanner;

public class C02_IfSoru {

	public static void main(String[] args) {
		//Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun  isimlerini yazdirin  
		
		// Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe” 
		//ilkHarf=S output = “Sali” 
		// *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin 
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen girmek istediginiz gunun ilk harfini yaziniz ");
       
       char ilkHarf=scan.next ().toUpperCase().charAt(0);
       
       
       
			
		
		if (ilkHarf=='P') {
			System.out.println(" Pazartesi,Persembe,Pazar");
			
		} else if (ilkHarf=='S') {
			System.out.println("Sali");
			
		} else if (ilkHarf=='C') {
			System.out.println("Carsamba,Cuma,Cumartesi");
			
		} else {
			System.out.println("girdiginiz harfte gecerli gun yok");

		} {
			

		}{

		}
		
scan.close();
		

	}

}
