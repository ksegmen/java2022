package day32_varargs_stringBuilder;

public class C04_varargs {

	public static void main(String[] args) {
		 KafanaGoreIslem(5,10,13,0);
			
			// varargs da hic eleman olmasada java itiraz etmez

		}

		private static void KafanaGoreIslem(int sayi1,int sayi2,int sayi3,int sayi4, int ... sayilar) {
			int toplam=0;
			for (int each: sayilar) {
				toplam+=each;
			}
			System.out.println("ilk sayi ile diger sayilarin toplaminin carpimi :" + sayi1* toplam);
			
			
			

	}

}
