package project1_kitap;
import static project1_kitap.Degisken.*;
public class KitapEkleme {
	
	
	

	public static void kitapEkle() {
		Kitap kitap1=new Kitap();
		
		
		System.out.println("eklemek isteginiz kitap adini giriniz ");
		scan.nextLine();
		kitap1.setKitapAdi(scan.nextLine());
		
		System.out.println("eklemek istediginiz kitabin yazarini giriniz ");
		scan.nextLine();
		kitap1.setYazarAdi(scan.nextLine());
		
		
		System.out.println("eklemek istediginiz kitabin fiyatini giriniz ");
		kitap1.setFiyat(scan.nextDouble());
		
		kitap1.setKitapNo(numara);
		kitapListesi.add(kitap1);
		numara++;
		
		System.out.println("ekleme islemi basarili");
		
		
	}

}
