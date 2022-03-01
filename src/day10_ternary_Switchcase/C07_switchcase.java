package day10_ternary_Switchcase;

public class C07_switchcase {

	public static void main(String[] args) {
		
		// gun numarasina gore gun isimlerini yazdiralim
		
		int gunNo=5;
		
		switch(gunNo) {
		
		
		
		case 1: 
			System.out.println("pazartesi");
			break;
			
		case 2 :
			System.out.println("Sali");
			break;
			
		case 3: 
			System.out.println("carsamba");
			break;
		case 4: 
			System.out.println("persembe");
			
			break; 
		case 5: 
			System.out.println("cuma");
			break;
			
		
		case 6: 
			System.out.println("cumartesi");
			break;
		case 7: 
			System.out.println("pazar");
			default :
				System.out.println("lutfen gecerli bir gun numrasi giriniz");

	}

} 
}
