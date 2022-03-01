package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class lambda02 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, -3, 7, 34, 22, -60, 42, 55));
		
		ciftKareMax(list);
		System.out.println();
		toplamList(list);
		System.out.println();
		toplamList1(list);
		System.out.println();
		ciftCarpim(list);
		System.out.println();
		ciftCarpim2(list);
		System.out.println();
		minListYazdir(list);
		System.out.println();
		minListYazdir(list);
		minListYazdir1(list);
		minListYazdir2(list);
		minListYazdir3(list);
		System.out.println();
		
	}
    
	// listteki cift olan elemanlarin karelerini aliniz ve en buyugunu yazdiriniz
	
	public static void ciftKareMax(List<Integer> list) {
		
		
		Optional <Integer> kareMax=list.stream().filter(lambda01::ciftBul).map(t->t*t).reduce(Integer::max);
		System.out.println(kareMax);
		//int kareMax=list.stream().filter(lambda01::ciftBul).map(t->t*t).reduce(Math::max); // bu variable calismaz
		// reduce return edilen eleman null yada int den buyuk olur ihtimali icin Java guvenlik olarak 
		// handle ederek Optional class i sart kosar 
		// reduce(Math::max) da kullanilabilir daha specific olugu icin Integer::max onerilir daha hizli calisir 
	}
		
		// listteki tum elemanlarin toplamini yazdiriniz lambda expression ile 
	public static void toplamList(List<Integer> list) {
		int toplam=list.stream().reduce(0,(x,y)->x+y);
		
		System.out.println(toplam);
		// t degiskeni her zaman ilk degerini atanan degerden alir (0)
		// u her zaman degerini list.stream() den alir akisdan alir 
		//x ilk degerden sonraki degerlerini islemden alir 
		
		//              x        y  
		//             ---       ---
		
		
		
		
	}
		
		//  listteki tum elemanlarin toplamini yazdiriniz method referance ile
	public static void toplamList1(List<Integer> list) {
		
	Optional<Integer > toplam1=list.stream().reduce(Integer::sum);
	Optional<Integer > toplam2=list.stream().reduce(Math::addExact);
	System.out.println(toplam1);
	System.out.println(toplam2);
	
	}
	
		//  listteki cift  elemanlarin carpimini yazdiriniz method referance yazdiriniz 
		
		
		
		public static void ciftCarpim(List<Integer> list) {
		int carpim=	list.stream().filter(lambda01::ciftBul).reduce(1,(x,y)->x*y);
			System.out.println(carpim);
			Optional<Integer> carpim1=	list.stream().filter(lambda01::ciftBul).reduce( Math::multiplyExact);
			System.out.println(carpim1);
		}
		
		
	//  listteki cift  elemanlarin yazdiriniz lambda expression ile 
		
		
		public static void ciftCarpim2(List<Integer> list) {
			int  carpim2= list.stream().filter(t->t%2==0).reduce(1,(x,y)->x*y);
			System.out.println(carpim2);
			// pozitif deger uretiniz 
			int  carpimPoz= list.stream().filter(t->t%2==0).reduce(-1,(x,y)->x*y);
			System.out.println(carpimPoz);
			
			// identity 1 veya -1 yazdik bu kisimdaki deger sorudaki varyasyonlari artirir -1 yazarak sonucu pozitif hale getirdik
		}
		
		
		// listteki elemanlardan en kucugunu 4 farkli yontemle yazdirniz 
		
		//1-
		public static void minListYazdir(List<Integer> list) {
			// method referance ile Integer class ile 
			Optional<Integer> min1=list.stream().reduce(Integer::min);
			System.out.println(min1);
		}
		//2-	
		public static void minListYazdir1(List<Integer> list) {
			// method referance ile Math class ile 
			Optional<Integer> min2=list.stream().reduce(Math::min);
			System.out.println(min2);
			
		}
			public static int minBul(int x, int y) {
				return x<y ?  x:y;
				
			}
			//3-
		public static void minListYazdir2(List<Integer> list) {
			// method referance kendi classimdan yukaridaki minBul methodunu cagirdim  
			Optional<Integer> min3=list.stream().reduce(lambda02::minBul);
			System.out.println(min3);
			
			
		}
			//4-
		public static void minListYazdir3(List<Integer> list){
			// lambda expression ile .
			Integer min4=list.stream().reduce(Integer.MAX_VALUE,(x,y)-> x<y?x:y);
			System.out.println(min4);
		}
			// listteki 15 den buyuk en kucuk tek sayiyi yaziniz
         
			
		//List'teki 15'ten buyuk en kucvuk tek sayiyi yazdiriniz
		public static void onbestenBykKckTekSayi(List<Integer> list) {
		    // list.stream().filter(t->t % 2 == 1).filter(t-> t>15).reduce(Integer::min);
		    System.out.println(list.
		            stream().//akısa girdi
		                    filter(t -> t % 2 == 1 & t > 15).//tek ve 15 den byk sarti
		                    reduce(Integer::min));//min deger reduce edildi
		}
		//list'in cift  elemanlarinin kareleri ni  kucuge buykten yazdiriniz
		public static void ciftKareKckByg(List<Integer> list){
		    list.
		            stream().
		            filter(lambda01::ciftBul).
		            map(t->t*t).
		            sorted().//akısa giren elelmanlar naturel order'e gore siralanir
		            forEach(lambda01::printEl);//144 484 1156 1764 3600 

		}


			
			
			
			
			
			
			
			
		
		
		
			

}
		
		
	
	
	
	
	
	
	
	
	
	

