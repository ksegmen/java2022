package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

    	Scanner scan=new Scanner(System.in); 
    	System.out.println("lutfen 4 harfli bir kelime giriniz ");
    	String str=scan.next();
    	String yeni=str.substring(3)+ str.substring(2,3)+ str.substring(1,2)+str.substring(0,1);
    
    	
    	
    	System.out.println(yeni);
    	
    	scan.close();
       
    }
}

