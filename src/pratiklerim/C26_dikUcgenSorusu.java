package pratiklerim;

import java.util.Scanner;

public class C26_dikUcgenSorusu {

	public static void main(String[] args) {
		
		// ternary pratikk
		
		
		
		
		
		/*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
   
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println(" lutfen uc adet kenar uzunlugu giriniz ");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		int kenar3=scan.nextInt();
		
		
		
String  sonuc=((kenar1*kenar1)+(kenar2*kenar2)==(kenar3*kenar3) ? "dik ucgendir" : "dik ucgen degildir ");
		 
		
System.out.println(" girdiginiz sekil : " + sonuc);


scan.close();



	}
	
	
	
	



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


