package day10_ternary_Switchcase;

public class C06_nestedTernary {

	public static void main(String[] args) {
		
		//Kullanicidan bir harf isteyin 
		// harf ise consola “Kucuk Harf” ,
		//buyuk harfse
		//consola “Buyuk Harf” 
		//yoksa “girdiginiz karakter harf degil” yazdirin.
		
		char krk='&';
		
		
		// String sonuc= (krk>='a' && krk<='z') ? " kucuk harf": (// sart yanlis ise sonuc );
		
		
		
		String sonuc = (krk>='a' && krk<='z') ? "kucuk harf" : 
		
		             (  (krk>='A' && krk <= 'Z') ? "buyuk harf" : " girilen karakter harf degil");
		
		
                System.out.println(sonuc);
	}

}
