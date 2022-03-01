package day29_staticBlock_passByValue;

public class C01_StaticBlocks {
	
	
	
	static {
		System.out.println("static block main methoddan bile once calisir ");
	}
	
	
	
	

	public static void main(String[] args) {
		
    System.out.println("javada once main method calisir");
    
    
    
    
    
	}
static {
	System.out.println("static block nereye yazilirsa yazilsin main methoddan bile once calisir ");
	
	
	// eger birden fazla static block varsa Java yukardakini daha once calistirir.
	
	
	
	
}
}
