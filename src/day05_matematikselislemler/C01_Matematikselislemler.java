package day05_matematikselislemler;

public class C01_Matematikselislemler {

	public static void main(String[] args) {
		System.out.println(4*(2+5)/2); //14
		
		System.out.println(4*(2+5)/3); //9 28/3=9.3333 ikiside integer old icin virgulden sonraki haneyi almaz 
		
		
		// sonucu virgullu yazdirmak istersek
		
		
		double sonuc= 4*(2+5)/3;
				System.out.println(sonuc); // 9.0 
				
				sonuc= (double) (4*(2+5)/3); // 9.0
				
				
				
				sonuc= (double) 4 * (2+5)/3; 
				System.out.println(sonuc); // 9.3333
				
				
				int sayi1=5;
				int sayi2=2;
				double sayi3=2;
				
				System.out.println(sayi1/sayi2); // 5/2= 2
				System.out.println(sayi1/sayi3); // 5/2=2.5
				System.out.println(sayi1+sayi3/sayi2);
				
		 
		
		
		

	}

}
