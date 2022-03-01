package replitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listSoru1 {

	public static void main(String[] args) {
		//Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

//		input :

//		Learning java is easy

//		output:

//		maximum occurring character is : a
		
		
		
		
		String string1="Javaisalsoeasy";
        String arr[]=string1.split("");
        String enCokTekrar="";
        int sayac=0;
        int max=0;
        
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					sayac++;
				}
				
			}
			if (sayac>max) {
				max=sayac;
				enCokTekrar=arr[i];
				
			}else if (max==sayac) {
				enCokTekrar+=" ," + arr[i];
			}
			sayac=0;
			{
				
			}
		}
        System.out.println(enCokTekrar);
        
   
	}
}
	
	

