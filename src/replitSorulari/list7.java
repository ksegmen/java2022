package replitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list7 {

	public static void main(String[] args) {
		//write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

	//	Input :{1,2,3,4,5,6}

	//	element:6

	//	Output : [1,2,3,4,5]
		
		
		
		int arr[]={1,2,3,4,5,6};
		
		
		String a=Arrays.toString(arr);
		System.out.println(a);
		List <Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		
		list.remove(list.size()-1);
		
		System.out.println(list);
	}

}
