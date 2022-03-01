package day08_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIF {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen cinsiyetinizi giriniz \n erkek icin E kadin icin K");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println(" lutfen yasinizi giriniz ");
		double yas=scan.nextDouble();
		
         if (cinsiyet=='E') {
            
            if (yas>=65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin");
            }
            
        } else if(cinsiyet=='K'){
            if (yas>=60) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin");
            }
            
        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf secin");
        }

	}

}
