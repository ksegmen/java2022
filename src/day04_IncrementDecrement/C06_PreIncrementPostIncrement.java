package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		// pre increment ve post increment sadece sayi++ veya sayi-- yazimi icin gecerlidir 
		
		int sayi=10;
		sayi++;
		sayi++;
		sayi++;
		System.out.println(sayi); //13
		
		System.out.println(sayi++); // 13bu satirda iki islem var 
		
		// bir artirma , bir de yazdirma var 
		
		// once artirmak sonra yazdirmal isterseniz ++sayi yazmaliyiz
		// once yazdirmak sonra artirmak isterseniz sayi++ yazariz
		System.out.println(sayi); //14
		
		
		System.out.println(++sayi); //15
		
		


	}

}
