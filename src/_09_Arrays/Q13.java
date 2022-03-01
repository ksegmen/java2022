package _09_Arrays;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan=new Scanner(System.in);
		
        
        int arr[]= new int [8];
     
      for (int i = 0; i < arr.length; i++) {
    	  System.out.println(i +".indexi   giriniz ");
        arr[i]=scan.nextInt();
	}
      
      int kova=0;
      
      for (int i = 0; i < arr.length; i++) {
		if (arr[i]%3==0) {
		
			
			kova++;
		}
		
	}
      
      System.out.println("3 e bolunen sayi:"+ kova);
      
	
	}

}