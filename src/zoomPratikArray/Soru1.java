package zoomPratikArray;

import java.util.Arrays;

public class Soru1 {

	public static void main(String[] args) {
		/*SORU 1
//multidimensional arrayin ic array lerindeki tum elemanlarin 
toplamini birer birer bulan
// ve herbir sonucu yeni bir arrayin elemani yapan ve yeni 
array i ekrana yazdiran programi yaziniz.
//input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		int arr1[][]= {{10,20,30},{4},{6,7,20}};
    	int arrYeni[]= new int[arr1.length];
    	for (int kat = 0; kat < arr1.length; kat++) {
			for (int daire = 0; daire < arr1[kat].length; daire++) {
			arrYeni[kat]+=arr1[kat][daire];	
			}
		}
    	
    		System.out.println(Arrays.toString(arrYeni));	

	}

}
