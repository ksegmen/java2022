package day19_whileLoop_doWhileLoop;

public class C04_doWhileLoop {

	public static void main(String[] args) {
		
		int i=0;
		while (i<5) {
			System.out.print(i + " ");
			i++;
		}
		
		// while loop once kontrol eder sonra kodu calistirir 
		// loop icinde artis yapilsada bir sonraki kontrole kadar kod calismaya devam eder 
		// bu da bazi durumlarda hatali saonuclara ulasmamiza sebep OLABILIR 
		
		
		
		// do while loop ise once islemi yapar sonra sarti kontrol eder 
		// ozellikle kullanicidan deger almalarda do while loop tercih edilir 
		
		int a=0;
		
		do {
			System.out.println(a+" ");
			a++;
		} 
		while (a<5); {       
			
		}
		 
		
		
		
		
		
		
		

	}

}
