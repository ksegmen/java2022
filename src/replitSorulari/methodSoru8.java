package replitSorulari;

import java.util.Arrays;

public class methodSoru8 {

	public static void main(String[] args) {
		birlestir();
	}
		

	private static void birlestir() {
		
		int arr1[]={1,2,3,4};
		int arr2[]={5,6};
		
		int[] arr3=new int [arr1.length+arr2.length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[i+arr1.length]=arr2[i];
		}
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	
	}
	}


