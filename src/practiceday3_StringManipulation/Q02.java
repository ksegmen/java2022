package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanicidan tek seferde alacaginiz  2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        // ad ayri soyad ayri sekilde ekrana yazdiriniz.

      
   

   	 Scanner scan =new Scanner (System.in);
 	     String str=scan.nextLine();
          int  bosluk = str.indexOf(' ');
 	     String isim=str.substring(0, bosluk);
 	     String soyisim=str.substring(bosluk+1, str.length()); 
 	     System.out.println(isim);   
 	     System.out.println(soyisim);
scan.close(); 
       
        	
    }
}