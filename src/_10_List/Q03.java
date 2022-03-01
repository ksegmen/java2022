package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */

      
    int arr[]= {1,2,3,4,5,6};
    	
    	List<int[]> list1=Arrays.asList(arr);
    	
    	int kare[]=new int[arr.length];
    	for (int i = 0; i < arr.length; i++) {
			kare[i]+=arr[i]*arr[i];
		}
    	System.out.println(Arrays.toString(kare));
    }
}
