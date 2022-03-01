package day15_methodCreation;

import java.util.Scanner;

public class C01MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini  isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri ilk harf buyuk digerelri olacak sekilde birlestirsin 
		// ikici method isim ve soyismin ilk harfleri buyuk harf kalan harfler * olacak sekilde birlestirsin 
		
		//kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun
		// ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
	System.out.println(" lutfen isminizi ve soyisminizi giriniz \n isimden sonra enter a basiniz  ");
	String isim=scan.next();
	String soyisim=scan.next();
	
	System.out.println(" lutfen isminizin ve soyisminizin acik veya gizli yazilmasi tercihinizi yaziniz "
			+ "\n acik istiyorsaniz 1 gizli istiyorsaniz 2 ye basiniz");
	
	int tercih=scan.nextInt();
	String birlesmisIsim=null; //Kubra Segmen, K**** S*****
	
	if (tercih==1) {
		birlesmisIsim=acikYazim(isim,soyisim);
	} else if (tercih==2) {
		birlesmisIsim=kapaliyazim(isim,soyisim);
		
	} else {
System.out.println("lutfen 1 veya 2 secin");
	} {

	}
	
		
	// bu saturdan itibaren kullanicin isim ve soyisimi kullanici tercihine bagli olarak 
	// kaydedilir
	
	scan.close();
		
		
		
		
		
		
		
	}

	public static String  kapaliyazim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w" , " *");
		
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w" , " *");

		
		
		
		return  isim + "" + soyisim;
		
		
		
	
		
	}

	public static String  acikYazim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

		return  isim + " "+ soyisim;
		
		
	}

}
