package replitSorulari;

import java.util.Scanner;

public class method1 {

	public static void main(String[] args) {
		reverse();
		

	}

	private static void reverse() {
Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            sayi /= 10;
        }
	
		
	}

}
