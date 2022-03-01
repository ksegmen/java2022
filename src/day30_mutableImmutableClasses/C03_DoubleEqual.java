package day30_mutableImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		// javada string iki turlu olusturulabilir
		// 1- non primitive oldugu icin new kywword ile 
		// java once esitligin sagina baktigindan new kelimesi oldugu icin once obje olusturur
		// sonra degeri atar 
		// yani bu olusturma seklinde her zmaan yeni bir obje olusur 
		
		// 2- bugune kadar ogrendigimiz gibi olusturusak 
		// String str="Mustafa";
		// java bu durumda esitligin saginda olan Stringin  STRING HAVUZUNDA olup olmadigini kontrol eder
		
		// ve havuzda varsa yeni obje olusturmaz 
		// dolayisiyla yeni obje olusturmadigi icin yeninin referansini da ekler 
		//  
		String str1="Mustafa";
		String str2="Mustafa";
		String str3= new String ("Mustafa");
		
		String str4=new String ("Mustafa");
		
		System.out.println(str1==str3); // false
		
		System.out.println(str1.equals(str3)); // true
		
		
System.out.println(str4==str3); // false
		
		System.out.println(str4.equals(str3)); // true
		
		System.out.println(str1==str2); // true      
		
		

	}

}
