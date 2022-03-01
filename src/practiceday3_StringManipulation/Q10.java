package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       
    	
    	
    	Scanner scan=new Scanner(System.in); 
    	System.out.println("lutfen adinizi ve soyadinizi ve kredi karti numranizi giriniz ");
    	String ad=scan.next();
    	String soyAd=scan.next();
    	String kart=scan.next();
    	
    	String isim=ad.substring(0,1).toUpperCase() + ad.substring(1).replaceAll("\\w", "*");
    	String soyIsim=soyAd.substring(0,1).toUpperCase() + soyAd.substring(1).replaceAll("\\w", "*");
    	String no= "**** **** ****" + kart.substring(12);
    	
    	if (kart.length()==16) {
			System.out.println("isminiz :" +isim + " " + "soyisminiz :" + soyIsim + " " + "kart numaraniz :" + no);
		} else {
          System.out.println(" lutfen 16 haneli bir kart numarasi giriniz ");
		}
  
    	scan.close();	
    
    }
}
