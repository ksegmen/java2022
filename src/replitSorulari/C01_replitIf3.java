package replitSorulari;

import java.util.Scanner;

public class C01_replitIf3 {

	public static void main(String[] args) {
		/* Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın. 
		 * Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71
*/

		Scanner scan=new Scanner(System.in);

		System.out.println("lutfen toplamak icin iki sayi giriniz ilk sayidan sonra enter a basiniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
	

			
		int toplam = 0;
		
		
		if (sayi1>=0 && sayi2>=0) {
			toplam=sayi1+sayi2;
			System.out.println(toplam);
			
		} 
		
		
		if (sayi1>=1000000000 || sayi2>=1000000000 || toplam>=1000000000) {
			System.out.println("overflow");
		}
		}
		

	}


