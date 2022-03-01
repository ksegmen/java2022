package pratiklerim;

import java.util.Scanner;

public class C31_replit {

	public static void main(String[] args) {
	/*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J* W**

CCN : ** ** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.
*/

		
         Scanner  scan=new Scanner(System.in);
         
         System.out.println("Lutfen adinizi soyadinizi ver kart numaranizi giriniz ");
		
         
         
         String ad=scan.next();
		String soyAd=scan.next();
		String kart=scan.next();
		
		String isimFormatli=ad.substring(0,1).toUpperCase() + ad.substring(1).replaceAll("\\w", "*");
		String soyisim=soyAd.substring(0,1).toUpperCase() + soyAd.substring(1).replaceAll("\\w", "*");
		String krediKart="**** **** ****" + kart.substring(12);
		
	
		System.out.println("Name :" + "\n" + isimFormatli + " " + soyisim);
		
		System.out.println("CCN :" +" " + krediKart);
		scan.close();
		
	}

}
