package day17_forLoops;

import java.util.Scanner;

public class C03_forLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir kelime girin ");
		
		String str=scan.next();
		
		ters(str);
		
		
		
		System.out.println(	ters(str));
		
		
		
		
		
		
		
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
