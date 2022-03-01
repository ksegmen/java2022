package day06_Wrapper;

public class C03_ConditionalOpeartors {

	public static void main(String[] args) {
		
		
		System.out.println(5+3==8 || 6+5==10 || 7-2==3);// true
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3); //false
		
		int a=10;
				int b=20;
				int c=30;
				
				boolean sonuc= a>b || b>c || a+b>=c ; // false false true 
				
				System.out.println(sonuc); //true 
				
				// && isareti yerine & de kullanilir ancak arada bir ince fark var
				//
				
				
				System.out.println(5+3==8 && 6+5==10 && 7-2==3); // true false false  islem sonucu false
				                                                 // ilk false u bulunca gerisine bakmaz java 
				
				System.out.println(5+3==8 & 6+5==10 & 7-2==3);  // true false false  tek & kullanirsan 3 islemide kontrol
				                                                 // eder 
				
     int yas=50;
    		 int boy=180;
    		 char cinsiyet='M';
    		 System.out.println(yas<30 && boy>170 && cinsiyet =='M'); // false true true sonuc false olur 
    		                                                          // son iki isleme bakmaz 
						
		

	}

}
