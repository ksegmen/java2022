package pratiklerim;

import java.util.Scanner;

public class C15_halukHcPratik {

	public static void main(String[] args) {
		/*
		 * Problem tanimi : 
		 * 
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 * 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
		 * alirsa %10 indirim yapin
	
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen urun adedini giriniz ");
		System.out.println("lutfen liste fiyatini giriniz ");
		System.out.println(" musteri kartiniz olup olmadigini evet veya hayir olarak  belirtiniz ");
		int adet=scan.nextInt();
		double fiyat=scan.nextDouble();
		String kart=scan.next();
		
		
		if (kart.equals("evet") && adet>= 10) {
			
			System.out.println("odeme miktari : "  + adet * (fiyat-(fiyat*20/100)));
			
		} else if (kart.equals("evet") && adet<10) {
			System.out.println(" odeme miktari : " +  adet * (fiyat-(fiyat*15/100)));
			
			
		} else if (kart.equals("hayir ") && adet>=10) {
			System.out.println("odeme miktari :" + adet * (fiyat-(fiyat*15/100)) );
			
		} else if (kart.equals("hayir ") && adet<10) {
			
			System.out.println(" odeme miktari :" + adet*(fiyat- (fiyat*10/100)));
			
		} else {
			System.out.println("lutfen gecerli bilgi giriniz ");

		}{

		}{

		}{

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		}
	
	
}
