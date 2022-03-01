package day10_ternary_Switchcase;

public class C05_nestedTernary {

	public static void main(String[] args) {
		
		// eger calısan kadınsa 60 yasından buyuk oldugunda emekli olabilir,
		// calısan erkekse 65 yasından buyukse emeklı olabilir 
		
		
		char cinsiyet='K';
		int yas=57;
		// her seferinde scanner olusturmak yerine test datalarimizi variable olarak da olusturabiliriz.
		// ve kod yazimi bittiginde bu test datalarini degistirerek kodlarimizi test edebilirz 
		
		String sonuc = cinsiyet=='K' ?  (yas>=60 ? "Emekli olabilirsin":"Emekli olamazsin") :
            (yas>=65 ? "Emekli olabilirsin":"Emekli olamazsin") ;

System.out.println(sonuc);

                                         
                                         
                                         
		
		
		
		
		
		

	}

}
