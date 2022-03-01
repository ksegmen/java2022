package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_arraysAsList {

	public static void main(String[] args) {
		
		// verlien arrayi arrays classsindan yardim alarak liste cevirebiliriz 
		
		String  arr[]= {"A","b","c","D"};
		List<String> arraydenList=Arrays.asList(arr);
		
		
		
		System.out.println(arraydenList);
		
		//arraydenList.add("F"); // RTE UnsupportedOperationException:desteklenmemis islem
		                       // cte olmasi icin syntax de problem olmasi lazim
		                       // ancak yazimda hata yok 
		
		
		// bu sekilde Arrays classsindn yardim alarak arrayi liste cevirirsek olusan listin boyutu sabit olur 
		// add() clear() gibi methodlar UnsupportedOperationException seklinde hata verir 
		
		arr[1]="Z";
		System.out.println("Array i degsitirdikten sonra, array =" + Arrays.toString(arr));
		
		
		

	}

}
