package zoomPratik;

import java.util.Scanner;

public class koordinatSorusu {

	public static void main(String[] args) {
		/*
         * Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran
         * bir kod yazınız.
         * 
         */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen X kordinati icin bir sayi giriniz");
        int x=scan.nextInt();
        
        System.out.println("Lutfen Y kordinati icin bir sayi giriniz");
        int y=scan.nextInt();
        
        if (x>0 && y>0) {
            System.out.println("Girdiginiz kordinatlar 1. bolgededir");
        } else if (x<0 && y>0) {
            System.out.println("Girdiginiz kordinatlar 2. bolgededir"); 
        }else if (x<0 && y<0){
            System.out.println("Girdiginiz kordinatlar 3. bolgededir");
        }else if(x>0 && y<0) {
            System.out.println("Girdiginiz kordinatlar 4. bolgededir");
        }else if(x==0) {
            System.out.println("Girdiginiz kordinatlar y kordinatinin uzerindedir");
        }else if(y==0) {
            System.out.println("Girdiginiz kordinatlar x kordinatinin uzerindedir");
        }else {
            System.out.println("Girdiginiz kordinatlar orijindedir");
        }
        
        scan.close();
	}

}
