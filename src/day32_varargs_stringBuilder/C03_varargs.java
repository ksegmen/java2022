package day32_varargs_stringBuilder;

public class C03_varargs {

	public static void main(String[] args) {
		
                KafanaGoretopla(5,8,10,13,0);
		
		// varargs list gibi davranir ama array methodlari ile calisir 

	}

	private static void KafanaGoretopla(int sayi1, int ... sayilar) {
		int toplam=0;
		for (int each: sayilar) {
			toplam+=each;
		}
		System.out.println("ilk sayi ile diger sayilarin toplaminin carpimi :" + sayi1* toplam);
	}

	}


