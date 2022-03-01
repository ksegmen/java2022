package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class lambda01 {

	public static void main(String[] args) {
		
		
		
		
		/*
		   1) Lambda "Functional Programming"
		      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
		   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
		   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
		   ve hatasiz code yazma acilarindan cok faydalidir.
		   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
		      Lambda kullanmak hatasız code kullanmaktır.
		*/
		
		
		List<Integer> list=new ArrayList<>(Arrays.asList(12,13,65,3,7,34,22,60,42,55));
		printElStructured(list)	; // method call
		System.out.println();
		printElFunctional(list); // lambda expression
		System.out.println();
		printElFunctional1(list); // method reference
		System.out.println();
		printCiftElStructured(list);
		System.out.println();
		printCiftElFunctional1(list);
		System.out.println();
		printCiftElFunctional2(list);
		System.out.println();
		printCiftAltmisKucuk(list);
		System.out.println();
		printElTekYirmi(list);
		System.out.println();
		printElCiftKare(list);
		System.out.println();
		printElKupFazla(list);
		System.out.println();
		printKarekokCift(list);
		System.out.println();
		maxElFunctional(list);
	}
	
  
	
	
	// structured programming ile list elementlerinin tamamini aralarina bosluk birakarak  yazdiriniz 
	public static void printElStructured(List<Integer>list) {
		
		for (Integer w : list) {
			System.out.print(w+" ");
		}
	}
	
	// functional programming ile list elementlerinin tamamini aralarina bosluk birakarak  yazdiriniz
	
	public static void printElFunctional(List<Integer>list)
	{
		list.stream().forEach(t-> System.out.print(t + " ")); // Lambda Expression lambda ifadesi
		// stream() datalari yukaridan asagiya akis sekline getirir 
		// foreach() datanin parametresine gore herbir elemani isler 
		// t-> lambda operatoru 
		// Lambda expression yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir 
		
 	}
	
	// method reference --> kendi create ettigimiz veya javadan aldigimiz method ile 
	// ClassName::MethodName ezberlee
	
	public static void printEl(int t ) { // refere edilecek method create edildi 
		
		System.out.print(t+" ");
		
	}
	
	public static void printElFunctional1(List<Integer>list) {
		list.stream().forEach(lambda01::printEl);
	}
	
	
	// // structured programming ile list elementlerinin cift olanlarini ayni satirda  aralarina bosluk birakarak  yazdiriniz
	
	
	public static void  printCiftElStructured(List<Integer>list) {
		for (Integer w: list) {
			if (w%2==0) {
				System.out.print(w+" ");
			}
		}
	}
	
	// functional programming ile list elementlerinin cift olanlarini ayni satirda  aralarina bosluk birakarak  yazdiriniz
	
	public static void printCiftElFunctional1(List<Integer>list) {
		list.stream().filter(t->t%2==0).forEach(lambda01::printEl);
		
		// filter()  akis icerisinde elemanlari istenen sarta gore filtreleme yapar
	}
	
	public static boolean ciftBul(int i ) {// refere edilcek tohum method create edildi
		return i%2==0; 
	}
	
	
	public static void printCiftElFunctional2(List<Integer>list) {
		list.stream().filter(lambda01::ciftBul).forEach(lambda01::printEl);// iki tane method refere ettik
		
		// filter()  akis icerisinde elemanlari istenen sarta gore filtreleme yapar
	}
	
	
	// functional programming ile list elementlerinin cift olanlarinin 60 dan kucuk olanlarini 
	//ayni satirda  aralarina bosluk birakarak  yazdiriniz
	
	public static void printCiftAltmisKucuk(List<Integer>list) {
		list.stream().filter(t->t%2==0 & t<60).forEach(lambda01::printEl);
	
	}
	
	
	// functional programming ile list elementlerinin tek olanlarinin veya  20 den buyuk  olanlarini 
		//ayni satirda  aralarina bosluk birakarak  yazdiriniz
	
	
	public static void printElTekYirmi(List<Integer>list) {
		list.stream().filter(t-> t%2==1 || t>20).forEach(lambda01::printEl);
	}
	
	// functional programming ile list elementlerinin cift olanlarinin karelerini 
			//ayni satirda  aralarina bosluk birakarak  yazdiriniz
		
	
	
	public static void printElCiftKare(List<Integer>list) {
		list.stream().filter(lambda01::ciftBul).map(t->t*t).forEach(lambda01::printEl);
		
	}
	
	
	// functional programming ile list elementlerinin tek olanlarinin kuplerini bir fazlasini
				//ayni satirda  aralarina bosluk birakarak  yazdiriniz
			
	public static void printElKupFazla(List<Integer>list) {
		list.
		stream().
		filter(t-> t%2==1).
		map(t->t*t*t+1).
		forEach(lambda01::printEl);
		
	}
	
	// functional programming ile list elementlerinin cift olanlarinin karekoklerini
	//ayni satirda  aralarina bosluk birakarak  yazdiriniz
	
	
	
	public static void printKarekokCift(List<Integer>list) {
		list.stream().filter(lambda01::ciftBul).map(Math::sqrt).forEach(t->System.out.println(t +" "));
	
	}
	
	
	// list in en buyuk elemanini yazdiriniz
	
	public static void maxElFunctional(List<Integer>list) {
		Optional<Integer>maxEl=list.stream().reduce(Math::max);
		
		System.out.println(maxEl);
		// reduce methodu bircok datayi tek bir dataya cevirmek icin kullanilir max min carpma toplama vs  sorularinda 
	}
	
	
	
	
}
