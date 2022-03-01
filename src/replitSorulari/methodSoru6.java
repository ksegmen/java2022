package replitSorulari;

import java.util.Arrays;

public class methodSoru6 {

	public static void main(String[] args) {
		
		//Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

		//Input : {3,2,5,4,1,6}

		//Output :

		//min: 1

		//: 6
		
		minMax();
		
	}

	private static void minMax() {
		int[] arr= {7,2,5,4,1,9};
	     int min=0;
	     int max=0;
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			min=arr[0];
			max=arr[arr.length-1];
			System.out.println(min);
			System.out.println(max);
		
		
	}

}
