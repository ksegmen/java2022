package replitSorulari;

public class forWhile2 {

	public static void main(String[] args) {
		/*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

Beklenen Cikti:
Beklenen Cikti:
30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120




*/
		int x=30;
		int y=40;
		int gcd=0;
		
		for (int i = 1; i <=x && i<=y; i++) {
			 
				if (x%i==0 && y%i==0) {
					gcd=i;
				     
				
			}
		}
		System.out.println( "30 ve 40 icin GCD ="+gcd);
		
		
		
		int lcm=0;
		
		lcm=(x*y)/gcd;
		
		System.out.println("30 ve 40 icin LCM =" + lcm);
	}

}
