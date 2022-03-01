package halukhcodev;

import java.util.Scanner;

public class C05_ScSoru5 {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
	        
	        System.out.println("birinci kenari giriniz");
	        int birincikenar= scan.nextInt();
	        System.out.println(" ikinci kenari giriniz");
	        int ikincikenar=scan.nextInt();
	        double hipotenus= Math.sqrt(birincikenar*birincikenar+ikincikenar*ikincikenar);     
	        System.out.println("Bu ucgenin hipotenusu=" +hipotenus);
		
		
		
		
		
		
		
		
		
		
		

	}

}
