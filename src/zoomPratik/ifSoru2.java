package zoomPratik;

import java.util.Scanner;

public class ifSoru2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise
gun   isminin   1.,2.   ve   3.harflerini   ilk   harf   buyuk   diger   ikisi   kucuk   olarak
yazdirin, gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		 
		 */
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen gun ismi giriniz");
	        String gun = scan.next();
	        if (gun.equalsIgnoreCase("Pazartesi") || gun.equalsIgnoreCase("pazar")) {
	            System.out.println("Paz");
	        } else if (gun.equalsIgnoreCase("Sali")) {
	            System.out.println("Sal");
	        } else if (gun.equalsIgnoreCase("Carsamba")) {
	            System.out.println("Car");
	        } else if (gun.equalsIgnoreCase("Persembe")) {
	            System.out.println("Per");
	        } else if (gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("cumartesi")) {
	            System.out.println("Cum");
	        } else {
	            System.out.println("gecerli bir gun ismi giriniz");
	        }
		
		
		}

	}


