package day12;

import java.util.Scanner;

public final class C03_lastIndexOf {

	public static void main(String[] args) {
		
		
		//Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz ");
				
				
			String cumle=scan.nextLine();
			System.out.println("lutfen varligini kontrol etmek icin bir harf giriniz ");
			char krk=scan.next().charAt(0);
			int index= cumle.lastIndexOf(krk);
			
			if (index==(-1)) {
				System.out.println("harf cumlede kullanilmamis");
			} else {
System.out.println("harf cumlede kullanilmis ");
			}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}
