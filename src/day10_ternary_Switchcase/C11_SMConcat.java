package day10_ternary_Switchcase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// string olarak verilen bir degiskeni + ile baska bir degiskenle 
		// isleme sokulursa java bunlari yanyana ekler
		// buna concatenaion denir 
		
		String isim= "Ali";
		String soyisim="Can";
		
		System.out.println(isim+ "" + soyisim );
		
		// ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		
		
		System.out.println(isim.concat(soyisim));
		System.out.println(isim.concat(" ").concat(soyisim));
		
		
		
		
		
		
		
		
		

	}

}
