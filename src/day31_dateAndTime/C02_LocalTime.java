package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
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
		
		System.out.println(saat.getMinute());
		
		System.out.println(saat.plusMinutes(10000));
		
		System.out.println(saat.minusHours(20));
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);
		
		
		
	}

}
