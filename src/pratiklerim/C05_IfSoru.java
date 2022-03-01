package pratiklerim;

import java.util.Scanner;

public class C05_IfSoru {

	public static void main(String[] args) {
		/* Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
		 *  “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. 
		 *  “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz ");
		
		String gun=scan.next().toLowerCase();
		if (gun.equals("cuma")) {
			System.out.println("muslumanlar icin kutsal gun");
			
		} else if (gun.equals("pazar")) {
			System.out.println("hristiyanlar icin kutal gun");
			
		} else if (gun.equals("cumartesi")) {
			System.out.println("yahudiler icin kutsal gun");
		} else {
			System.out.println("haftanin bir gunu ");

		} {

		}{

		}

		scan.close();

	}

}
