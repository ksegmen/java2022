package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// kullanicidan deger almak isin 3 adim takip edilir 
		// 1. adim Scanner objesi olusturmak
		Scanner scan=new Scanner(System.in);
		//2.adim kullaniiciya ne istediginizi soylemeniz 
		
		System.out.println("lutfen isminizi yaziniz");
		
		String isim=scan.next();
		
		System.out.println("isminiz..:"+isim);
		
		
		// scan bir scanner objesidir 
		// isim olarak farkli bir isim olarakda calisir ama biz scan demeyi tercih ederiz
		// scan b ir obje oldugu icin data turu non primitive dir 
		// primitive data turleri sadece deger icerirken non primitiveler degerin yaninda 
		// birde methodlar barindirir
		// scan. dedigimizde kullanabilecegimiz bu methodlari gorebiliriz
		
		
		
	 

	}

}
