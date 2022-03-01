package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	Personel (){
		System.out.println("Personel parametresiz constructor calisti");
	}
	
	// eger variable lara access modifier yazmazsak 
	// java access modifier olarak default acc atar 
	// boyle olursa sadece o package altindaki child classlar perosnel class ini inherit edebilir 
	// baska package lardaki child classlarinda inherit edebilmesi icin variable ve methodlarin 
	// access modifier ini protected yapmamiz lazim
	// public yapsakda inherit edilebilir ama biz herkesin erismesini degil de sadece child classlarin erismesini istedigimizden 
	// protected tercih ederiz 
	
	

	public static void main(String[] args) {
		
	}

}
