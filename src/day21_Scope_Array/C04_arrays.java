package day21_Scope_Array;

import java.util.Arrays;

public class C04_arrays {

	public static void main(String[] args) {
		
		// arrayin elemenalarini yazdirmak istersek loop ile yazdirabiliriz
		
		int arr[]= {2,4,5,6,78,89};
		
		//tum elementleri yazdirabiliriz 
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
		// ya da arrays classindan yardim alip direk array olarak yazdirabiliriz
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
