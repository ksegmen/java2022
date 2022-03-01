package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		// bir string ve bir int variable olusturalim
		// bir loo icerisinde bu variable lari 1000 kere degisitirelim 
		// ve islem surelerini kiyaslayalim
		
	LocalTime saat=LocalTime.now();
		
		System.out.println("baslangic saati:"+saat);
		
		
		int sayi=10;
		for (int i = 0; i < 100000; i++) {
			sayi++;
		}
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati :" + saatBitis);
		
		// eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak 
		//hem basinda hem sonunda LocalTime objesi olusturmaliyiz
		
		double nano1=saat.getNano();
		double nanoBitis=saatBitis.getNano();
		System.out.println("For  Loop " + (nanoBitis-nano1) + "nano saniyede tamamlandi");
		
		
		
		
		
		
		
		
		
		
		
		
LocalTime saatS=LocalTime.now();
		
		System.out.println("baslangic saati:"+saatS);
		
		
		String str= "celil";
		for (int i = 0; i < 100000; i++) {
			str+= " ";
		}
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("bitis saati :" + saatBitisS);
		double nanoS=saatS.getNano();
		double nanoBitisS=saatBitisS.getNano();
		System.out.println(" string For  Loop " + (nanoBitisS-nanoS) + "nano saniyede tamamlandi");
		
		double stringSure=nanoBitisS-nanoS;
	    double intSure=	nanoBitis-nano1;
	    System.out.println("int string den " + (stringSure-intSure) + "nano saniye daha hizli bitirdi");
		
		
		
	}

}
