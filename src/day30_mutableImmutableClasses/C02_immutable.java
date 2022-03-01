package day30_mutableImmutableClasses;

public class C02_immutable {

	public static void main(String[] args) {
		
		String str="Ali";
		for (int i = 0; i < 100; i++) {
			str+=" ";
			
		}
		
		
		// bu kod calistiginda java kac obje olusturur?
		
		
		// bir obje basta olusruruldu 
		// loop da ise 100 obje daha olusturuldu
		// dolayisiyla bu kod calistiginda biz ekranda birsey gormeyiz ama java 101 obje olusturmus olur 
		// str in son degeri "Ali         (100 tane bosluk)      "
		
		
	}

}
