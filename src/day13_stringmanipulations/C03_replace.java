package day13_stringmanipulations;

public class C03_replace {

	public static void main(String[] args) {
		
		
		
		String str= "Java ogrenmek cok zevkli";
		
		System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("ogrenmek" , " kod yazmak "));
        
        System.out.println(str.replace("Java", "kod"));
        System.out.println(str.replace("e", "a"));
        
        
	}

}
