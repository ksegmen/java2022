package project1_kitap;
import static project1_kitap.Degisken.*;

public class BilgiileGoruntuleme {
	
	
	
	static boolean bulunduMu;
	static int i=0;
	
	
	
	

	public static void main(String[] args) {
		System.out.println("goruntuleme tipini seciniz"
				+ "\nKitap adi ile  goruntulemek iicin 1 i"
				+ "\nYazar adi ile goruntulemek icin 2 i"
				+ "\nTuslayiniz");
		
		
		String secim=scan.next();
		switch(secim) {
		
		
		case "1":
			kitapAdiileGoruntule();
			break;
		case "2":
			yazarAdiileGoruntule();
			
		
		
		
		
		}

	}





	public static void yazarAdiileGoruntule() {
		
		System.out.println("goruntulemek istediginiz yazarin adini giriniz ");
		scan.nextLine();
		String yazarAdi=scan.nextLine();
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getYazarAdi().equals(yazarAdi)) {
				bulunduMu=true;
				break;
				
			}
			
		}
		
		if (bulunduMu) {
			System.out.println(kitapListesi.get(i));
		}
		else {
			System.out.println("aradiginiz kitap bulunmamaktadir");
		}
		
	}





	public static void kitapAdiileGoruntule() {
		
		System.out.println("lutfen aradiginiz kitabin adini yaziniz ");
		scan.nextLine();
		String kitapAdi=scan.nextLine();
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getKitapAdi().equals(kitapAdi)) {
				bulunduMu=true;
				break;
			}
		}
		
		if (bulunduMu) {
			System.out.println(kitapListesi.get(i));
		}
		else {
			System.out.println("aradiginiz kitap bulunmamaktadir ");
		}
		
	}

}
