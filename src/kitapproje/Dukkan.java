package kitapproje;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dukkan  {


    static List<Veri> liste= new ArrayList<Veri>();
    static int kitapNo=1000;
    static Scanner scan=new Scanner(System.in);

     public static void main(String[] args){
         menu(liste);
     }

    public static void menu(List<Veri> liste){
        System.out.println("*******ceran kitap*****\\n1: Kitap ekle\\n2: Numara ile kitap sil\\n3: \" +\n" +
                "    //             \"Tum kitaplari listele\\n4: Bitir");

        System.out.println("lutfen isleminizi seciniz ");
        int secim= scan.nextInt();
        switch(secim){
            case 1:
                ekle(liste);
                break;
            case 2:
                sil(liste);
                break;
            case 3:
                listele(liste);
                break;
            case 4:
            bitir();
            break;
            default:
                System.out.println("yanlis secim yaptiniz ");
                break;
    }














        }

    public static void bitir() {
        System.out.println("tesekkur ederiz cikisiniz tamamlandi");
    }

    public static void listele(List<Veri> liste) {
        for (Veri v : liste) {
            System.out.println(v.toString());
        }
        menu(liste);
    }

    public static void sil(List<Veri> liste) {
        System.out.println("lutfen sileceginiz kitabin numarasini giriniz");
        int silNo=scan.nextInt();
        for (Veri v : liste) {
           if (!liste.contains(v)) {
               System.out.println("sileceginiz kitap bulunamadi ");
           } else if (v.getNo()==silNo){
               liste.remove(v);
               System.out.println("silme isleminiz gerceklesti");

           }

        }
        menu(liste);
        }





    public static void ekle(List<Veri> liste) {
        System.out.println("kitap isminizi giriniz ");
        scan.nextLine();
        String ad=scan.nextLine();
        scan.nextLine();
        System.out.println("lutfen yazar ismi giriniz");
        String yazarAdi=scan.nextLine();
        scan.nextLine();

        System.out.println("lutfen yayin yilini giriniz");
        int yayin=scan.nextInt();
         scan.nextLine();
        System.out.println("lutfen fiyat giriniz");

        double fiyat=scan.nextDouble();

        Veri kitap=new Veri(++kitapNo,ad,yazarAdi,yayin,fiyat);
        liste.add(kitap);
        System.out.println(kitap.toString()+ " eklendi");
        menu(liste);


    }


}



