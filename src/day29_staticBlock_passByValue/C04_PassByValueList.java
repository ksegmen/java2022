package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		// sonra list elemanlarini degistir methodu yazip orada
		//lsit elemanlarindan bazilarini degistirelim
		//method void olsun
		// main method a dondukten sonra yeniden list i yazdiralim 
		List<String> harfler= new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		// javada list ve array gibi objeler icin de pass by value gecerlidir 
		// yani farkli bir methodda array veya list e yeni deger atamasi yaparsaniz 
		// orjinal array veya list degismez 
		
		
		listDegistir(harfler); // methodda yeni deger atadigim halde harfler listesi degismedi
	
System.out.println("list e yeni list atadiktan sonta main methoda donunce list :" + harfler);
		listElemanlarDegistir(harfler);
		System.out.println("main methoda donunce list : " + harfler);
			}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		
		System.out.println("List e yeni deger atayinca :" + harfler);
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		harfler.set(0, "D");
		
		System.out.println("Methodda degsitridigimiz list : " + harfler);
		
	}

}
