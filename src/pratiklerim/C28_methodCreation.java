package pratiklerim;

import java.util.Scanner;

public class C28_methodCreation {

	public static void main(String[] args) {
		
		 /*
        Problem Tanımı :
        Basit 4 işlem yapan bir hesap makinesi kodlayınız....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
      */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isleminiz + - * / sembollerden biri   ile seciniz");
		
		String sembol=scan.next();
		
		System.out.println("lutfen iki sayi giriniz ilk sayidan sonra enter a basiniz ");
		int sayi1=scan.nextInt();
		int  sayi2=scan.nextInt();
		
		
		
		
		
		
	if (sembol.equals("+")) {
		toplama(sayi1, sayi2);
	} else if (sembol.equals("-")) {
		cikarma(sayi1, sayi2);
		
	} else if (sembol.equals("*")) {
		carpma(sayi1, sayi2);
	} else if (sembol.equals("/")) {
		bolme(sayi1, sayi2);
	} else {
System.out.println("gecersiz secim ");
	} {

	}{

	}{

	}
		
		
		scan.close();
		

	}

	public static void bolme(int sayi1, int sayi2) {
		System.out.println(sayi1/sayi2);
		
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println(sayi1*sayi2);
		
	}

	public static void cikarma(int sayi1, int sayi2) {
		System.out.println(sayi1-sayi2);
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
		
	
	
	}


}
