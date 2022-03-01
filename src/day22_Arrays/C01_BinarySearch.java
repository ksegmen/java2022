package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[]= {"Hacer","ainagul","Emine","Murat","Kutlu"};
		
		//isimler arrayinde Murat ismi var mi?
		
		// array de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
     isimler[4]="Ainagul";
     
     System.out.println(Arrays.toString(isimler));
     Arrays.sort(isimler);
     System.out.println(Arrays.toString(isimler));
     System.out.println(Arrays.binarySearch(isimler, "Murat"));
     System.out.println(Arrays.binarySearch(isimler, "Mehmet"));  
     
     
     
	}

}
