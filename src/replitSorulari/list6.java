package replitSorulari;

import java.util.Arrays;

public class list6 {

	public static void main(String[] args) {
		//Write a program to find the common elements between two String Arrays (without case sensitivity)

//		Input1 : {John,Brad,Ange,Sofia,Emily}

//		Input2 : {sofia,brad,grace,emily,hazel}

//		Output : [sofia,brad,emily]
		
		
		String arr[]={"John","Brad","Ange","Sofia","Emily"};
		
		
		String arr1[]={"sofia","brad","grace","emily","hazel"};
		String yeni="";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i].equalsIgnoreCase(arr1[j])) {
					yeni+=arr[i]+" ";
				}
			}
		}
		String arr2[]=yeni.split(" ");
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
