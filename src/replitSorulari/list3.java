package replitSorulari;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class list3 {

	public static void main(String[] args) {
	/*	Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

		Note: Upper and lower case letters, spaces and special characters will not be changed.

		Input :

		It is very nice to write code.

		Output :

		.edoc etirw ot ecin yrev si tI
		*/
		
		// *******************ilk yontem******************
		/*String str;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=scan.nextLine();	
		System.out.println("Reverse of a String '"+str+"' is  :"); 
		int i=str.length();
		while(i>0)
		{
		System.out.print(str.charAt(i-1)); 
		i--;
		}
		*/
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=scan.nextLine();	
		char[] ch=str.toCharArray(); 
		System.out.println("Reverse of a String is :"); 
		int j=ch.length;
		for(int i=j;i>0;i--)
		{
		System.out.print(ch[i-1]); 
		}
	}

}
