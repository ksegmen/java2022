package pratiklerim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class C32 {

	public static void main(String[] args) {
		
		
		
		
		 // kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
    	
		
	String str=  "Javacilar cook afilli" ;
	
	String krk[]= str.split("");
	
	
	//System.out.println(Arrays.toString(krk));
	

	
	List<String> list=Arrays.asList(krk);
	

	//System.out.println(list);
	int adet=0;
	
	List<String> son=new ArrayList<>();
	
	for (int i =0 ; i <list.size()-1 ; i++) {
		
		adet=Collections.frequency(list,list.get(i));
		
	String yeni= list.get(i)+ " "+":"+ " "+ adet;
	      son.add(yeni);
	
		//System.out.print(yeni);
		
		
		
	}
	
	System.out.println(son);	
      
	
		
	
	}
		
	}


