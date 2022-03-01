package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// main methoddan diger methodlara veya diger methodlardan main methoda 
		// bir variable gonderirseniz Java orjinal variable lari degil 
		// onlarin degerlerini goturur(value),orjinal variable in degeri degismez 
				int fiyat=100;
				
				
				
				
				indirimYap10(fiyat);
				System.out.println("methoddan sonra main methoddAKI fiyat :" + fiyat);//100
                System.out.println(indirimYap10(fiyat));
				indirimYap25(fiyat); // %25 indirimli fiyat :75
				System.out.println("methoddan sonra main methoddAKI fiyat :" + fiyat);//100
                System.out.println(indirimYap25(fiyat));
                fiyat=indirimYap10(fiyat);
			}

			private static int indirimYap25(int fiyat) {
				
				fiyat*=0.75;
				return fiyat;
			}

			private static int indirimYap10(int fiyat) {
						fiyat*=0.90;
					return fiyat;
	}

}
