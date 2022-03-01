package project1_kitap;
import static project1_kitap.Degisken.*;
import static project1_kitap.Degisken.scan;
public class KitapSilme {
	static int i=0;
	static boolean bulunduMu;

	
	public static void kitapSil() {
		
		System.out.println("silmek istediginiz kitabin numarasini giriniz ");
		
		int num=scan.nextInt();
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getKitapNo()==num) {
				bulunduMu=true;
				break;
			}
		}
		
		
		
		
		if (bulunduMu) {
			kitapListesi.remove(i);
			System.out.println("kitap silinmistir ");
		}else {
			System.out.println("aradiginiz kitap bulunmamaktadir");
		}
	}
	
	
	
	
	
	

}
  