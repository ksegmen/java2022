package lambdapratik;

import java.util.Scanner;

public class pratik2 {

public static void main(String[] args){

   // 1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız
    //Test Data
   // 34
   // Beklenen Çıktı
  //  7
    int rakam;
     int rakamlarToplami = 0;
    Scanner scan=new Scanner(System.in);
    System.out.println("lutfen bir sayi giriniz ");
    int sayi=scan.nextInt();

    while(sayi>0) {
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;


    }
    System.out.println(rakamlarToplami);
   scan.close();








}





}
