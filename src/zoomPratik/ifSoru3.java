package zoomPratik;

import java.util.Scanner;

public class ifSoru3 {

	public static void main(String[] args) {
		/*Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini
yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin
ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin”
yazdirin,   sayilardan   sifira   esit   olan   varsa   “sifir   carpmaya   gore   yutan
elemandir” yazdirin
		 * 
		 * 
		 * 
		 * 
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki sayi girinz");
		
		int a=scan.nextInt();
		int b= scan.nextInt();
		
		if (a>0 && b>0) {
		System.out.println("toplam : " + (a+b));	
		} else if (a<0 && b<0) {
			System.out.println("carpim : " + (a*b)) ;
		} else if (a*b<0) {
			System.out.println("islem yapamazsiniz");
		} else if (a==0 || b==0 ) {
			System.out.println("0 yutan elemandir");
		}  {
			
		}{

		}{

		}{
			

		}
		
      scan.close();		
		
		
	}

}
