package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_array {

	public static void main(String[] args) {
		//Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		String cumle="Her sey, Javayla kolay";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));
		System.out.println("girilen cumlede" + kelimeler.length+ "adet kelime var");
		
		

	}

}
