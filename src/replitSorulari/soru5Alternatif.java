package replitSorulari;

public class soru5Alternatif {

	public static void main(String[] args) {
		// sayimiz 5 sonraki 10 tane asal sayiyi yazdriyoruz
		  int sayac = 0;
	        for(int sayi=6;sayi<=50; sayi++)
	        {
	            int kontrol = 0;
	            for (int i = 2; i < sayi; i++)
	            {
	               if (sayi % i == 0)
	                {
	                    kontrol = 1;
	                    break;
	                } 
	            }
	                
	            if(kontrol==0)
	            {
	                System.out.print(sayi+"\n");
	                sayac++; 
	            }else if (sayac==10) {
					break;
				}{
					
				}
	        }
		
	}

}
