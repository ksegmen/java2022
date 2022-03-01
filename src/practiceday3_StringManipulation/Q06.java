package practiceday3_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

    
    	Scanner scan=new Scanner(System.in); 
    	System.out.println("lutfen email adresinizi giriniz");
    	
    	String str=scan.next();
    	
    	if (str.contains("hotmail")) {
    		System.out.println(str.replace("hotmail", "gmail"));
			
		} else {
			System.out.println("gecerli bir adres giriniz ");

		}
    	scan.close();
    }
}
