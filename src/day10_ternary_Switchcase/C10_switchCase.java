package day10_ternary_Switchcase;

public class C10_switchCase {

	public static void main(String[] args) {
		//verilen sayiyi inceleyin
		// Girilen sayi
		// 10 ise �Iki basamakli en kucuk sayi 
		// 100 ise �uc basamakli en kucuk sayi�
		// 1000 ise �dort basamakli en kucuk sayi�
		// diger durumlarda �Girdigin sayiyi degistir� yazdirin
     
		int sayi=10;
		
		switch( sayi ) {
		case 10:
			System.out.println("iki basamakli en kucuk sayi");
			break;
		case 100:
			System.out.println(" uc basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("dort basamakli en kucuk sayi");
			default:
				System.out.println(" sayiyi degisitirin ");
		
		
		
		
		
		
		
		
		}	
		
	}

}
