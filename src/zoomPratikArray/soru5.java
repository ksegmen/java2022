package zoomPratikArray;

import java.util.Arrays;

public class soru5 {

	public static void main(String[] args) {
		/*/*Write a return method that accepts 2 integer Arrays as 
parameters And adds 2
array into a new Array and prints it.
Input1={1,2,3,4} 
Input2={5,6}
Output={1,2,3,4,5,6
*/
		int arr1[]={1,2,3,4} ;
		int arr2[]= {5,6};
		
		
		birlestir( arr1,  arr2);
		

	}

	private static void birlestir(int[] arr1 , int[] arr2) {
		int[] arr=new int [arr1.length+arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			 arr[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr[i+arr1.length]=arr2[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
