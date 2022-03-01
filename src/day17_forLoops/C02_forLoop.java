package day17_forLoops;

import java.util.Scanner;

public class C02_forLoop {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.


		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir kelime girin ");
		
		String isim=scan.next();
		
		for (int i = isim.length()-1; i >=0 ; i--) {
			System.out.print(isim.substring(i,i+1));
		}
		
		scan.close();
		
		
		
	}

}
