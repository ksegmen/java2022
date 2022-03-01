package day32_varargs_stringBuilder;

public class C05_varargs {

	public static void main(String[] args) {
              topla(5,10,13,0);
		
		// varargs dan once farkli parametreler kullanilabilir ama varargs dan sonra parametre yazilamaz 
              // yazarsaniz java vararg son parametre olmalidir diye sizi uyarir ve CTE verir

	}

	private static void topla( int ... sayilar) {
		int toplam=0;
		for (int each: sayilar) {
			toplam+=each;
		}
		System.out.println("girilen sayilarin toplami :" + toplam);
	}
	}


