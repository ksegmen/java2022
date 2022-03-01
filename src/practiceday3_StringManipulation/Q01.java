package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        

         
    	
    	
    	Scanner scan=new Scanner(System.in); 
    	
    	System.out.print("bir isim giriniz ");
    	String str=scan.nextLine();
    	
    boolean varMi=	str.contains(" ");
    	System.out.println("girilen stringde bosluk var mi:" + varMi);
    	
    	 // Kullanicidan  alacağını bir stringin bos olup olmadığını kontrol ediniz.
        
    	str.isEmpty();
    	
    	System.out.println("girilen string bos mu:" + str.isEmpty());
    	
    	scan.close();
    	
}

}