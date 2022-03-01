package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;
		Integer sayi2=20;
		
		// sayi1. yazdigimizda hicbir method cikmaz cunku sayi1 int dir yani primitive dir 
		
		// sayi2. yaazdigimizda ise bircok method gelir cunku sayi2 Integer dir yani wrapper class dir.
		
		String tel1="3578987";
		String tel2= "3245434";
		
		System.out.println(tel1+tel2); // 35789873245432
		// bu sayilari toplamak isterseniz 
		System.out.println(Integer.valueOf(tel1)+ Integer.valueOf(tel2)); //6824421
		
		
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); //  2147483647
		
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
		
		System.out.println(Short.MAX_VALUE);  // 32767
		
		//String caddeno="B203";
		String caddeno="203";
		String sokakno= "1564";
				System.out.println(Integer.valueOf(caddeno)+Integer.valueOf(sokakno));
				// Integer.valueOf(String numerik ifade ) method u string olarak kaydedilmmis numerik ifadeelri sayiya cevirir
				// ancak string ifadede numerik olmayan bir karakter olursa java number format exception hatasi veriri ve 
				// calismayi durdurur buna stops execution denir sonrada baska islem yapmaz 
				
				System.out.println("Hello World");
		


		

	}

}
