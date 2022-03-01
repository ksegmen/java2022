package zoomPratik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayListSort {

	public static void main(String[] args) {
		//sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
		// ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen istediginiz harfleri giriniz" );
		String str=scan.nextLine();
	  char ch[]=str.toCharArray();
	  System.out.println(Arrays.toString(ch));
			   
	Arrays.sort(ch);
	System.out.println(Arrays.toString(ch));
	}

}
