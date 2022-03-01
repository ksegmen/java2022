package day16_forLoops;

public class C01_forLoop {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			
			
			
			
			
			
		}
		
		// for loop baslangic ve bitis sarti bir sayinin degerine bagli olan 
					// durumlarda tercih edilir 
					
		
		//for (int i = 0; i < 10; i--) {
			
			//System.out.println(i + " ");  
		//eger baslangic sayisi artis azalis ile bitis degerine yaklasmiyor uzaklasiyor ise 
			
			                              // loop hicbir zaman durmaz bu duruma SONSUZ LOOP deriz 
			                              // ve gerceklesmesini istemeyiz 
		
		
	for (int i = 0; i > 10; i++) {
		
		System.out.println(i + " acaba calisir mi  ");   // loop broken 
	}
	
	// eger ilk deger icin bitis sarti true olmazsa 
	// daha ilk adimda loop broken olur dolayisiyla
	// loop body hic calismadan loop un sonrasina gecilir 
	// loop calisir ama hicbir islem YAPMAZ 
	
	
	
		
		
		
		

	}

}
