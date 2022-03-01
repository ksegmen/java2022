package halukhcodev;

import java.util.Scanner;

public class C02_ScSoru2 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("uc basamakli bir sayi giriniz ");
	int sayi=scan.nextInt();
	int birler= sayi%10;
	int onlar= (sayi/10)%10;
	int yuzler=sayi/100;
	
	System.out.println("birler basamagi: " + birler + "\n" +
			" onlar basamagi : "  + onlar + "\n" +"yuzler basamagi : " + yuzler );
	scan.close();
	


}

	}


