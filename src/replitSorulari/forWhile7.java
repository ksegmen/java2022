package replitSorulari;

public class forWhile7 {

	public static void main(String[] args) {
		
		// mukemmel sayi sorusu 
	}
      
	
	
	int toplam = 0;
        
        
	int x=6;
        
        for(int i = 1; i < x; i++)
        {
            if(x % i == 0) {
                toplam += i;
            }
        }
        if(x== toplam) {
            System.out.println(x+ " Mükemmel bir sayidir");
        }
        else {
            System.out.println(x + " Mükemmel bir sayi degildir.");

	}

}
}
