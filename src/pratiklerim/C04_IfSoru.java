package pratiklerim;

import java.util.Scanner;

public class C04_IfSoru {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup  olmadigini yazdirin 


		   Scanner scan=new Scanner(System.in);
		   System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz \n birinci kenardan sonra enter a basiniz");
		   double kenar1=scan.nextDouble();
		   double kenar2=scan.nextDouble();
		    if (kenar1==kenar2) {
		    	System.out.println(" sekliniz karedir ");
				
			} else {
				System.out.println(" sekliniz kare degildir ");
				scan.close();

			}
	}

}
