package replitSorulari;

import java.util.Scanner;

public class C02_replitIf4 {

	public static void main(String[] args) {
		/* Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,

"Talebiniz işleniyor" mesajı yazdırılır

yanıt b ise,

"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,

"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

başka herhangi bir yanıt değeri için,

"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
*/
		 Scanner scan=new Scanner(System.in);
		 System.out.println(" lutfen bir karakter giriniz");
		    char yanit=scan.next().charAt(0);
          if (yanit=='a') {
			System.out.println("Talebiniz işleniyor");
		} else if (yanit=='b') {
			System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
		} else if (yanit=='c') {
			System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
		} else {
			System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");

		} {

		} {

		}
		scan.close();
	}

}
