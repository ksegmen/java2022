package pratiklerim;

import java.util.Scanner;

public class C17_halukHcPratik {

	public static void main(String[] args) {
		
	
        /*
        Problem tanimi : 
      Kulanıcıdan aracının hızını alınız
      Trafik cezasının değerini hesaplayın.
          45 hız sınırıdır.
          Eğer hızınız 55-74 arasında ise:
          Ceza 100 $'dır.

          Eğer hızınız 75 - 84 arasında ise:
          Ceza 150 $'dır.

          Eğer hızınız 85 -94 arasında ise:
          Ceza 320 $'dır.

          Eğer hızınız 94'den daha fazla ise:
          Ceza 500 $'dır.

          ve ayrıca,
          Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

          Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

                   
		*/
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("aracinizin hizini giriniz ");
        System.out.println("ehliyetiniz var mi sorusunu evet yada hayir seklinde cevaplayiniz...");
		double hiz=scan.nextDouble();
		
		String ehliyet=scan.next();
		
	
		
		if (ehliyet.equals("evet") && 45<hiz && hiz<=74) {
			
			System.out.println("cezaniz :" + 100 );
			
		} else if (ehliyet.equals("evet")   && hiz<= 84) {
			System.out.println("cezaniz :" + 150 );
			
		} else if (ehliyet.equals("evet")   && hiz<= 94) {
			System.out.println("cezaniz :" + 320 );

			
			
		} else if (ehliyet.equals("evet")   && hiz>94) {
			System.out.println("cezaniz :" + 500 );
			
			
			
		} else if (ehliyet.equals("hayir") && 45<hiz && hiz<=74) {
			System.out.println("cezaniz :" + 300 );
			
			
		} else if (ehliyet.equals("hayir")   && hiz<= 84) {
			System.out.println("cezaniz :" + 350 );

			
		} else if (ehliyet.equals("hayir")   && hiz<= 94) {
			System.out.println("cezaniz :" + 520 );
		} else if (ehliyet.equals("hayir")   && hiz>94) {
			System.out.println("cezaniz :" + 700 );
		} else {
			System.out.println(" yanlis veri girdiniz");

		} {

		} {

		} {

		}{

		} {

		} {
		} {

		}
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

