package day02_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" lutfen isminizi ve soyisminizi giriniz: ");
		
		String isimsoyisim= scan.nextLine();
		System.out.println("isim-soyisim: " + (isimsoyisim));

	}

}
