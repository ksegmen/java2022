package practice22Kasim;

import java.util.Scanner;

public class C04_soru2 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz

		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir metin giriniz ");
		String str=scan.nextLine();
		int index=0;
		do {
			if (index%2==1) {
				System.out.print(str.charAt(index)+ " ");
			}
			
			index++;
		} while (index< str.length());
		
		
		
		
		

	}

}
