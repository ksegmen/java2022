package replitSorulari;

import java.util.Scanner;

public class C03_replitIf5 {

	public static void main(String[] args) {
		/*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        INPUT:

       Ay Numarasi:

        2

        Yil :

        2016

      OUTPUT :

      Subat 2016 29 Gundur.
      */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir ay numarasi giriniz ");
		int ay=scan.nextInt();
		
		
		switch (ay) {
		case 1 :
		case 3 :
		case 5 :
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("30 gundur");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("31 gundur ");
		
		break;
		case 2:
		System.out.println("lutfen yil giriniz ");
		int yil=scan.nextInt();
		
		if (yil%4==0) {
			System.out.println("subat " + yil + " 29 gundur");
		} else {
             System.out.println("subat " + yil + " 28 gundur");
		}
		
		scan.close();
		}
		
		
		
		
		
		
	}

}
