package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_sort {

	public static void main(String[] args) {
		
		List<String> isimler=new ArrayList<> ();
		
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler); //Kutlu Emrah Ferhat
		
		Collections.sort(isimler);
		
		System.out.println(isimler); // emrah ferhat kutlu siralama yaptik
		
		
		
		isimler.add("filiz");
		System.out.println(isimler);
		
		
		Collections.sort(isimler);
		System.out.println(isimler);

	}

}
