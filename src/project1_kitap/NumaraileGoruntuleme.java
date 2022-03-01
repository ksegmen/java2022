package project1_kitap;
import static project1_kitap.Degisken.*;
public class NumaraileGoruntuleme {
	
	static int i=0;
	static boolean bulunduMu;
	
	
	public static void numaraileGoruntule() {
		System.out.println("gormek istediginiz kitabin numarasini giriniz ");
		int num=scan.nextInt();
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getKitapNo()== num) {
				bulunduMu=true;
				break;
			}
		}
		
		
		
		if (bulunduMu) {
			System.out.println(kitapListesi.get(i));
		}else {
			System.out.println("aradiginiz kitap listemizde yoktur ");
		}
	}

}
