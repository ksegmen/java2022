package day13_stringmanipulations;

import java.util.Scanner;

public class C01_endsWith_startsWith {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir kelime alalim
		//verilen cumlenin verilen kelime ile baslayip baslamadigini
		// ve bitip bitmedigini ydirin
		
  
		
		
 Scanner scan=new Scanner(System.in);
 
		
		System.out.println("lutfen bir cumle yaziniz");
		
		System.out.println(" lutfen bulmak istediginiz karakter yada kelime diizmini giriniz ");
		
		
		
		String str1=scan.nextLine();
		String str2=scan.next();
		if (str1.startsWith(str2)) {
			System.out.println("girilen cumle " + str2 + "ile basliyor");
		} else {
			System.out.println("girilen cumle " + str2 + "ile baslamiyor");
			
			
			
			if (str1.endsWith(str2)) {
				System.out.println("girilen cumle " + str2 + "ile bitiyor");

			} else {
				System.out.println("girilen cumle " + str2 + "ile bitmiyor");


			}

		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
