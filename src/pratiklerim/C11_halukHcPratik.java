package pratiklerim;

import java.util.Scanner;

public class C11_halukHcPratik {

	public static void main(String[] args) {
		
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen IT alaninizi giriniz...");
     
		
		String alan= scan.next();
		
		if (alan.equals("quality analist")) {
			System.out.println(" qa ");
		} else if (alan.equals("developer")) {
			System.out.println(" dev ");
		} else  if (alan.equals("busines analyst")) {
			System.out.println("project manager ");
			System.out.println(" pm ");
			
		} else {
			System.out.println(" gecersiz alan girdiniz ");

		}{

		}{
			
			
			scan.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
