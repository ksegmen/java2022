package zoomPratik;

import java.util.Scanner;

public class enCokTekrarEdenHarf {

	public static void main(String[] args) {
	    /*
         * 
         * Create method that finds repeated characters in a String Bir String'de
         * tekrarlanan karakterleri bulan method create ediniz
         * 
         * 
         */
    Scanner scan=new Scanner(System.in);
    System.out.print("Bir metin giriniz :");//kullanıcıdan bir metin girmesini istiyoruz
    String metin=scan.nextLine();// metin boşluklar ihtiva ediceginden nextLine ifadesinin içine depoluyoruz 
    
    String enCokTekrarEdenHarf=tekrarlananHarBul(metin); //metodumuzu oluşturup return edilen harfe burada yazdırırken kolaylık olsun diye atama yapıyoruz
    System.out.println("Girilen metin :"+metin+"\nEn çok tekrar eden harf :"+enCokTekrarEdenHarf);//metoddan gelen harfi yazdırıyourz
    
    
    
    }
    private static String tekrarlananHarBul(String metin) {
        int sayac=0;//tekrar eden harfin tekrar sayısını hesaplayabilmek için 
        int maxHarf=0;//farklı harflerin tekrar etmesi durumunda en çok tekrar edeni bulmak için sayacın saydıgı degerleri bir sorgu yapıp buyukse atayacagım konteynerımı tanımlıyorum
        String tekrarlıHarf=""; //tekrar eden harfleri toplayacagım konteynırım
        String arr[]=metin.split("");//yukarıda kullanıcının girdigi metini split("") ile parcalayıp arraye eleman olarak yazıyorum.
        
        for (int i = 0; i < arr.length; i++) {//kontrol etmek için diziden sırayla harf çagırıyourz
            for (int j = i+1; j < arr.length; j++) {//karşılaştırma yapmak için çagırdıgımz harften sonraki harfleri çagırıyoruz
                if (arr[i].equalsIgnoreCase(arr[j])) {//aynı degilmi diye harf duyarlılıgı olmadan kontrol ediyoruz
                sayac++;    //aynı harfleri buldugmuzda sayısını hesaplamak için bir sayac koyfuk
                }
                }if (sayac>maxHarf) {//sayacın karşılaştırma sonucu buldugu harfin tekrar sayısı ile elimizdeki diger harflerin tekrar sayısını karşılaştırıyoruz
                    maxHarf=sayac; //buldugumuz harfin tekrar sayısı fazla  ise maxharf sayacına elimizdeki degeri atıyoruz
                    tekrarlıHarf=arr[i];//buldugumuz tekrar eden harfi de stringe atıyoruz
                    
                }else if (sayac==maxHarf) {//peki aynı sayıda tekrar eden farklı harfler varsa? onu da buradan yapıyoruz
                    tekrarlıHarf+=arr[i];//aynı sayıda tekrar eden harfleri yazdırmak için += operatörünü kullanıyoruz böylece aynı sayıda tekrar eden harfleri yanyana yzdırabiliyoruz
                } 
                    sayac=0; //dizideki diger harfleri tekrar karşılaştırma yapabilmek için i degeri 1 artarken sayacı da sıfırlıyoruz 
            }
        
        return tekrarlıHarf; // buldugumuz harfi metoda return ediyoruz

	}

}
