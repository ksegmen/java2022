package day13_stringmanipulations;

public class C04_replaceAll {

	public static void main(String[] args) {
		
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlari kullanarak Java ogrenmek cok kolay a cevirelim 
		
		
		str=str.replaceAll("\\d", "");
		
		System.out.println(str);
		
		str=str.replaceAll("\\s", "x");
		
		
		str=str.replaceAll("\\W", "");
		System.out.println(str);
		 
		// bosluklari geri getirmek icin 
		
		str=str.replace("x", " ");
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
