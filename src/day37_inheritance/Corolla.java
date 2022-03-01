package day37_inheritance;

public class Corolla extends Toyota{
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	
	String uretimYeri="Turkiye";

	public static void main(String[] args) {
		
            Corolla                  arb1             =               new           Corolla();
     //Class ismi&& Data Turu      obje ismi       assignment        keyword        constructor
            
            
           
            // javada obje olusturdugumuz her class ismi ayni zamanda bir data turudur 
            // bu ornegimiz icin corolla hem class adi hem de olusturdugumuz arb1 objesinin data type i dir.
           // javada obje uretilen herbir class ayni zamanda non primitive data turu olur 
            
            System.out.println(arb1.calisiyorMu);
            System.out.println(arb1.tekerSayisi);
            System.out.println(arb1.uretimYeri);
            
            
            
            
            Toyota arb2=new      Corolla();
            
            System.out.println(arb2.calisiyorMu);
            System.out.println(arb2.tekerSayisi);
            
            
            
            
            
            Araba arb3=new      Corolla();
            System.out.println(arb3.calisiyorMu);
            
            
            Araba arb4=new Araba();
            

            
            
	}

}
