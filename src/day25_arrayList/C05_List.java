package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilenen bir listede icinde belirli bir harf olan elemanlari 
		// silen bir method yazinzi
		
		List<String> str=new ArrayList<>();
		
		
		str.add("Ceyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");
		
		
		System.out.println(str);
		
		String silinecekHarf="a";
	killThemAll(str, silinecekHarf);
	
		
		
	}

	public static List<String> killThemAll(List<String> str, String silinecekHarf) {
		
		
		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).contains(silinecekHarf)) {
				str.remove(i);
				i--;          
			}
			
		}
		
		
		
		
		
		System.out.println(str);
		
		return str;
		
		
		
		
		
	}

}
