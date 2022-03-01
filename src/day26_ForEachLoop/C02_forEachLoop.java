package day26_ForEachLoop;

public class C02_forEachLoop {

	public static void main(String[] args) {
		// Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		
		int arr[]= {1,2,3,4,5,6};
		int carpim=1;
		for (int i : arr) {
			carpim*=i;
		}
		
		System.out.println("arrayin elemanlarinin carpimi : " + carpim);

	}

}
