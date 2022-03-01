package project1_kitap;
import static project1_kitap.Degisken.*;
public class Listeleme {

	public static void listele() {
		if (kitapListesi.size()<0) {
			System.out.println("hic kitabiniz yoktur");
		}else {
			System.out.println(kitapListesi);
		}
		
	}

	
}
