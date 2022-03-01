package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    	
    	Scanner scan=new Scanner(System.in); 
    	System.out.print("isminizi  giriniz ");
    	String str=scan.nextLine();
    	
    	
    	char a=str.toUpperCase().charAt(0);
    	char b= str.toUpperCase().charAt(str.indexOf(" ")+1);
    	char c=str.toUpperCase().charAt(str.lastIndexOf(" ")+1);
    	
    	System.out.println(a+"."+ b + "." + c +".");
    	
    	
    	
    	scan.close();
    	
    	
    	

    }       
}
