package pratiklerim;

import java.util.Scanner;

public class C03_IfSoru {

	public static void main(String[] args) {
		//Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin 
		//Ornek: gun=Pazar output = “Hafta sonu” 
		//gun=Sali output = “Hafta ici” 
			//	*** String icin equals method’unu kullanin 

		
		Scanner scan=new Scanner(System.in);
		 System.out.println("lutfen bir gun ismi yaziniz ");
			
		
		String gun=scan.next().toLowerCase();
		  if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("haftasonu");
		} else {
			
System.out.println("haftaici");

		}
		  scan.close();

	}

}
