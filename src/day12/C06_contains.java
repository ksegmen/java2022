package day12;

import java.util.Scanner;

public class C06_contains {

	public static void main(String[] args) {
		
		
		//Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
				//@gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
		         // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
				
		
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen email adresinizi giriniz ");
	
	String adres=scan.next();
	
	int uzunluk=adres.length();
	int index=adres.lastIndexOf("@gmail.com");
	if (! adres.contains("@gmail.com")) {
		System.out.println(" lutfen gmail adresi giriniz");
	} else if (index==uzunluk-10) {
		System.out.println("email adresinzi kaydedildi "); }
		
		else {
			System.out.println(" lutfen yazimi kontrol edinzi");
		}
	
	
	
	
	scan.close();
	}{
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


