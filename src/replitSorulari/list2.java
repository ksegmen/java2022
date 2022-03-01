package replitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list2 {

	public static void main(String[] args) {
		//Create a 10-element list. Swap the 8th element with the 3rd element.

//		INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

//		Output:

//		[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		
		
		// String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		
		
		List<String> list=new ArrayList<>();
	
	     list.add("Umit");
	     list.add("Emin");
	     list.add("Kemal");
	     list.add("Kerem");
	     list.add("Taylan");
	     list.add("Orhan");
	     list.add("Sinan");
	     list.add("Furkan");
	     list.add("Ahmet");
	     list.add("Ali");
	     System.out.println(list); //[Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
	     
	     list.set(2, "Furkan");
	     System.out.println(list);
	    list.set(7, "Kemal");
	    System.out.println(list);
	    
	    
	   list.add(7, list.get(2));
	   System.out.println(list);//[Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Kemal, Furkan, Ahmet, Ali]
	   list.set(2, list.get(8));
	   System.out.println(list); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Furkan, Ahmet, Ali]
	   list.remove(8);
	    
	    System.out.println(list); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]
	}
	

}
