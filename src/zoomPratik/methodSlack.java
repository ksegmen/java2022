package zoomPratik;

public class methodSlack {

	public static void main(String[] args) {
		/*addDigits isminde bir method oluşturun.
		Parametresi int
		Pozitif   int   değerler   ver   ve   en   son   sonuç   tek   basamaklı   çıkana   kadar
		basamakları birbiriyle topla.
		Tek basamaklı çıktığında, döndürün
		Örnek1:
		Girdi 38
		Çıktı: 2
		Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
		2 , tek basamaklı olduğundan, bunu döndürün.
*/


  

		   
		   addDigits();
		
		    
	
}

	private static void addDigits() {
		
		int toplam=0;
		   int yeni=0;
		   int sayi = 777;
		   int digit=0;
		   

		while(sayi>0) {
			   digit=sayi%10;
			   toplam=toplam+digit;
			   sayi=sayi/10;
			   
		   }
		   
		   
		  
		 System.out.println(toplam);
				
			
			
			yeni+=toplam;
			while(yeni>=10) {
				yeni=toplam%10;
				toplam/=10;
				yeni+=toplam;
				
			}
			
			System.out.println(yeni);
			
			
	
		
	

		
	}
}