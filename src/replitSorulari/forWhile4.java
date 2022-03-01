package replitSorulari;

public class forWhile4 {

	public static void main(String[] args) {
		/*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
*/
      
		int x=6;
		int sonuc=1;
		for (int i  =x; i >=1 ; i--) {
			sonuc*=i;
		}
		
		System.out.println(" 6!=65432*1=" + sonuc);
		
		
		
	}

}
