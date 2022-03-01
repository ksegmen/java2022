package practice22Kasim;

import java.util.Scanner;

public class C07_soru18 {

	public static void main(String[] args) {
		 //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
		
		Scanner scan=new Scanner(System.in);
		
	
	String systemPin="javacanlara selam olsun";
			int girisHakki=3;

		
		
		
		while(true) {
			System.out.println("lutfen pin giriniz");
			String pin=scan.nextLine();
			if (pin.equals(systemPin)) {
				System.out.println("gayet basarili");
				break;
			}
			else {
				System.out.println("hatali giris yapildi");
				girisHakki--;;
				System.out.println("kalan deneme hakkiniz " + girisHakki);
				
				if (girisHakki==0) {
					System.out.println("giris hakkiniz kalmadi  ");
					break;
				}
			}
			
		}
		
		scan.close();

	}
	
	
	

}
