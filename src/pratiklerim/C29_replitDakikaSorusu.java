package pratiklerim;

import java.util.Scanner;

public class C29_replitDakikaSorusu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dakika giriniz");
        int dakika = scan.nextInt();
        int yilDakika = 60 * 24 * 365 + 360;// dakika*saat*gun+kalan saatin dakikasi=525960
        int yil = dakika / yilDakika;// yaklasik yil sayisi
        int fark1 = yil * yilDakika;// 6*525960=3155760(6 yilin net dakikaksi)
        int fark2 = dakika - fark1;// kullanicinin girdigi dakikadan 6 yilin dakikasini cikardim
        int kalanGun = fark2 / (60 * 24) + 1;// kalan dakikalari gun hesabi yaptik yaklasik dedigi icin +1 dedik
        System.out.println(dakika + " dakika yaklasik " + yil + " yil " + kalanGun + " gundur");

	}

}
