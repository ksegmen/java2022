package javapracticeday01;

public class Q_01 {

	public static void main(String[] args) {
		// verilen 12345 sayisinin rakamlarini yukaridan asagi dogru yazdiriniz 
		// orenk input:12345
		// output: 1
		//         2
		//         3
		//         4
		//         5
		
		int sayi=12345;
		
		int birler= sayi%10 ;  // birler basamagi sayinin 10 a bolumunden kalandir  5
		int onlar= (sayi/10)%10  ; // onlar basamagini verir 4
		int yuzler= (sayi/100)%10  ;  // yuzler basaamgi
		int binler= (sayi/1000)%10 ;
		int onBinler= (sayi/10000) ;  // modulus yapmaya gerek yok bolme sonucu zaten 1 
		
		/*System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		*/
		// konsolda alt satira yazdirmak icin "\n" komutu kullanilir
		
		System.out.println(onBinler+ "\n" + binler+"\n" + yuzler + "\n" + onlar + "\n"+birler);
		
		
		


	}

}
