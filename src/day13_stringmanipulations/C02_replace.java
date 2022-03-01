package day13_stringmanipulations;

public class C02_replace {

	public static void main(String[] args) {
		
		
		//string olarak verilen 10.000sayisinizn
		// binden buyuk olup olmadigini yazdirin
		
		
		String str="10.000";
	
		
		
		
		str=str.replace(".", "");  // 10000 e  cevirip str a assign ettik 
		                           // = oldugu icin str kalici olarak degisti 
		
		if (Integer.valueOf(str)>1000) {
			System.out.println("bulunan sonuc sayisi 1000den cok");
		} else {
      System.out.println("bulunan sonuc sayisi binden az");
		}
		

	}

}
