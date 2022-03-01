package replitSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
	//	Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers 
		//if they are even or not in a return method.

//				Input : 5

//				Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi girin :");
		int sayi = scan.nextInt();
		List<Integer> liste = new ArrayList();
		
       int say=0;
	
	for (int i = sayi+1; ; i++) {
		
		int asal=1;	//flag
		
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				asal=0; //flag
				break;
			}
		}if (asal==1) {
		liste.add(i);
		say++;
		}if (say==10)break;			
		
	}System.out.println(liste);
	

}
}
