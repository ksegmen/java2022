package replitSorulari;

import java.util.Arrays;

public class list9 {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string.(Ignore case sensitivity).

Input : Learning java is easy

Output: maximum occurring character is : a
		 * 
		 * 
		 * 
		 */
		
		
		String a="Learning java is easy";
		int sayac=0;
		int max=0;
		String arr[]=a.split("");
        System.out.println(Arrays.toString(arr));
        String tekrar="";
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					sayac++;
					
				}
        	}
				if (sayac>max) {
					max=sayac;
					tekrar=arr[i];
				}else if (sayac==max) {
					tekrar+=arr[i];
				}{
					sayac=0;
				}
			}
			System.out.println(tekrar);
		}
}  


