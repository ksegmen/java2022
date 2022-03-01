package replitSorulari;

import java.util.Scanner;

public class C04_replitIf6 {

	public static void main(String[] args) {
		/*    Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
		
		 */
   
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir isim giriniz ");
	
		
		String isim=scan.next();
		char index=isim.charAt(0);
		char index1=isim.charAt(1);
		char index2= isim.charAt(2);
		if (isim.length()!=3) {
			System.out.println("yanlis uzunlukta isim girdiniz tekrar deneyiniz ");
		} 
		
		
	System.out.println(index==index1 || index1==index2 ?   "isim ayni karakterlere sahiptir. " : "Dizenin benzersiz karakterleri var  ");	
	}

}
