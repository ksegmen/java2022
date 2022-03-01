package day21_Scope_Array;

import java.util.Arrays;

public class C06_arrays {

	public static void main(String[] args) {
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[]= {3,5,8,5,2,4};
		
		
		int kova=0;
		
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			kova+=arr[i];
			
		}
		
		
		
		System.out.println("elementlerin toplami :" + kova);

		// arrayin tum elemanlarini once kucukten buyuge
		//sonra buyukten kucuge yazdirin 
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// buuykten kucuge yazirmk icin ya for loop ile elmenalari yazdirabiliriz 
		
		for (int i =  arr.length; i >=0; i--) {
			System.out.println(arr[i]+" ");
			
			
		}
		
	// array yapmak isterseniz ayni uzunlukta bir array olusturup elemanlari ters sirada 
		//yeni array e tasiyabilirsiniz 
		
		
		int tersArray[]=new int [arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(tersArray));

	}

}
