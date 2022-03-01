package day22_Arrays;

import java.util.Arrays;

public class C03_split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		
		//cumlesinin kelimelerini, ozel karakterler ve noktalama isaretleri olmadan
		// harf sirasina gore yazdiralim
		
		String cumle= "Java ogrendim,  #cok para ?kazandim.,";
		
		String kelime[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelime));
		
		for (int i = 0; i < kelime.length; i++) {
			
			kelime[i]=kelime[i].replaceAll("\\W", "");
				
		}
	 System.out.println(Arrays.toString(kelime));
	 
	 Arrays.sort(kelime);
	 
	 String yeniCumle="";
	 
	 for (int i = 0; i < kelime.length; i++) {
		 System.out.print(kelime[i]+" ");
	
	}
	 
	 
	 
		}
		
		
		
		

	}


