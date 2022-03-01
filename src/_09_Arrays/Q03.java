package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
        
    	int arr[]= {1,2,-3,4,-5,-6};
    	
    	int yeni[]=new int [arr.length];
    	for (int i = 0; i < arr.length; i++) {
    		
			yeni[i]=-1*arr[i];
			System.out.print(yeni[i]+ " ");
		}
    	
    System.out.println( " ");
    System.out.print(Arrays.toString(yeni));

    }


}
