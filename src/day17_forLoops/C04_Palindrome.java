package day17_forLoops;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		//Soru 9 ) Interview Question Kullanicidan bir String isteyin. 
		//Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

		
		
		
		
		
		
		

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir kelime girin ");
		
		String str=scan.next();
		
		ters(str);
		
		
		
		if (str.equals(ters(str))) {
			System.out.println("girdiginiz string palidrome");
		}
		
		else {
			System.out.println("girdiginiz string palindrome degil ");
		}
		
		scan.close();
		
		
		
		
		
		
		
	}

	public static String  ters(String str) {
		
     String tersStr="";
     
     for (int i = str.length()-1; i >=0; i--) {
    	 
    	 tersStr+=str.substring(i, i+1);
    	 
		
	}

		
		
		return tersStr;
		
	
	
	}

}
