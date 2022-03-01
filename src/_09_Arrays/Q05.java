package _09_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		
      int arr[]= {1,2,3,4,5,6,7};
      int toplam=0;
		

      for (int i = 0; i < arr.length; i++) {
		toplam+=arr[i];
		
		}
      int ortalama=toplam/arr.length;
      System.out.println(ortalama);
      Arrays.sort(arr);
    
     for (int i = arr.length; i >ortalama; i--) {
		System.out.print(i+ " ");
	}
      
      
      
    		  
     
      	}
     
	}
      
      

	
		
	
		
	


