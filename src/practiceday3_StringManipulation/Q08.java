package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
    	
    	
    	
    	Scanner scan=new Scanner(System.in); 
    	System.out.println("lutfen bir kelime giriniz ");
    	String str=scan.next();
    	String yeni=str.substring(1);
    	if (str.length()==3) {
			System.out.println(yeni+yeni+yeni);
			
		} else {
       System.out.println("isminiz 3 harfli degil");
		}
    	scan.close();
    	
    	
       
    }
}
