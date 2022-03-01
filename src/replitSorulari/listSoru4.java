package replitSorulari;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class listSoru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String isimler="Ali,Veli,Ayse,Fatma,Omer";
		
		String arr[]=isimler.split(",");
		List<String> str=Arrays.asList(arr);
		System.out.println(str);
		String yeni1="";
		for (int i = 0; i < str.size(); i++) {
			if (!str.get(i).contains("a") && !str.get(i).contains("A")) {
				yeni1+=str.get(i)+" ";
			}
		}
		System.out.println(yeni1);

		
		String []arr2=yeni1.split(" ");
		
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
