package replitSorulari;

import java.util.Scanner;

public class C06_replitIf8 {

	public static void main(String[] args) {
		// Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

//Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

//INPUT : Mustafa

//OUTPUT : fafafa
             
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir isim giriniz");
		
		String isim=scan.next();
		for (int i = 0; i <3; i++) {
			System.out.print(isim.substring(isim.length()-2));
			
			
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
