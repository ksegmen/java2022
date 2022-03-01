package javapracticeday01;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		/*
	      * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
	      */
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen adinizi giriniz :");
		// system out print girilen veriyi ayni satira yazdirir
		// system out println veriyi alt satira yazdirir
		
		String name= scan.nextLine();
		System.out.println("soyadinizi giriniz :");
		String surName=scan.nextLine();
		System.out.println("yasinizi giriniz :");
		int age=scan.nextInt();
		System.out.println("boyunuzu giriniz :");
		double boy=scan.nextDouble();
		System.out.println("kilonuzu giriniz :");
		double kilo=scan.nextDouble();
		System.out.println("benim adım:"+name+"\n"
		        +"soyadım :"+surName+"\n"
				+"yasim:"+age+"\n"
				+"boyum:"+boy+"cm"+"\n"
				+"kilom:"+kilo+"kg");
				scan.close();
		
		
		
		

	}

}
