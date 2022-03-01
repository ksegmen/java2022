package day04_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		
		byte sayi1=44;
		short sayi2=sayi1;
		
		// esitligin sol tarafi short sag tarafi byte 
				// iki data turu farkli old halde java itiraz etmiyor
				// cinku atama yapilan variable in data turu short atanan degerin veri turunden byte  daha buyuk
				// oldugu icin sorun olusmaz 
		
		
		System.out.println(" sayi2 : " +  sayi2 ); 
		
		int sayi3=55;
		double sayi4= sayi3; 
		 
		System.out.println(" sayi4 : " +  sayi4 );
		// atanan degerin data turu(int) , deger atanan variable nin data turunden (double) kucukse 
		//java casting i otomatik yapar bu isleme auto widening denir 
		
		
		
		
		
		

	}

}
