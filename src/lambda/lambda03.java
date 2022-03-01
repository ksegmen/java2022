package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda03 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("mehmet","emre","nilgun","yildiz","kader","emine","islam","islam","emre"));
		bykHarfTekrarsiz(list);
	}
	
	//  list elemanlarini alfabetik buyuk harf ve tekrarsiz yazdiriniz 
	
	public static void bykHarfTekrarsiz(List<String> list) {
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println);
	
		
		
	}

}
