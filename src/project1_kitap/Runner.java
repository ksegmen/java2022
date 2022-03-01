package project1_kitap;
import static project1_kitap.Degisken.*;

public class Runner {

	public static void main(String[] args) {
		/*====================PAZAR PROJEMIZ==============================
		 * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun
		 * program baslayinca menu isminde bir method calissin
	 1-kitap ekle
	2-numara ile kitap goruntule
	3-bilgi ile kitap goruntule
	4-numara ile kitap sil
	5-tum kitaplari listele
	6-cikis
	************************************
	1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait yazar adi olacak
	ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir
	 list'te tutmamiz gerek
	2-kitap numarasi 1000'den baslamali,her kitap
	eklendiginde bir artacagi icin sayac gibi dusunulebilinir count=1000; menu
	 isminde bir method olusturmaliyim,
	3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
	 4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
		 */
		
		menu();
		
		
		
	}
	
	

	private static void menu() {

		while( mainMenu) {
			System.out.println(mainMenuMetin);
			String secim=scan.next();
			
				switch(secim)
		{
		
		case "1" :KitapEkleme.kitapEkle();
		 break;
		case "2": NumaraileGoruntuleme.numaraileGoruntule();
		
		break;
		
		case "3":BilgiileGoruntuleme.kitapAdiileGoruntule();
		break;
		case "4":BilgiileGoruntuleme.yazarAdiileGoruntule();
			
		break;
		case "5": KitapSilme.kitapSil();
		
		break;
		case "6": Listeleme.listele();
		case "7":
			mainMenu=false;
			break;
			default:
				System.out.println("hatali giris yaptiniz, lutfen tekrar deneyiniz ");
		
		
		break;
		
		
		
		
		
		
	}
		
		
		

	

}

	

	
	}
}