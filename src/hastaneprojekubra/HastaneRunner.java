package hastaneprojekubra;

public class HastaneRunner extends VeriBankasi {

    static boolean aciliyet;
    private static Hastane hastane1 = new Hastane();

   static  String hastaDurumu = "Kalp hastalilari";
    public static void main(String[] args) {

        String unvan = doktorUnvan(hastaDurumu);
        hastane1.setDoktor(doktorBul(unvan));
        hastane1.setHasta(hastaBul(hastaDurumu));
        System.out.println(doktorBul(unvan).toString());
        System.out.println(hastaBul(hastaDurumu));
    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equals("Allerji")) {
            return unvanlar[0];
        } else if (aktuelDurum.equals("Bas agrisi")) {
            return unvanlar[1];
        } else if (aktuelDurum.equals("Diabet")) {
            return unvanlar[2];
        } else if (aktuelDurum.equals("Soguk alginligi")) {
            return unvanlar[3];
        } else if (aktuelDurum.equals("Migren")) {
            return unvanlar[4];
        } else if (aktuelDurum.equals("Kalp hastaliklari")) {
            return unvanlar[5];
        }

        return "yanlis durum";

    }


    public static Doktor doktorBul(String unvan){

        Doktor doktor = new Doktor();

        for(int i = 0; i < unvanlar.length; i++ )
        {

            if(unvan.equals(unvanlar[i])) {
                doktor.setIsim(doctorIsimleri[i]);
                doktor.setSoyIsim(doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }


        }
        return doktor;

    }

    public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum hastaDurumu = new Durum();

        if (hastaDurumu.equals("Allerji")) {
           hastaDurumu.setAciliyet(false);
        } else if (hastaDurumu.equals("Bas agrisi")) {
            aciliyet = false;
        } else if (!hastaDurumu.equals("Diabet")) {
            if (hastaDurumu.equals("Soguk alginligi")) {
                aciliyet = false;
            } else if (hastaDurumu.equals("Migren")) {
                aciliyet = true;
            } else if (hastaDurumu.equals("Kalp hastaliklari")) {
                aciliyet = true;
            } else {
                System.out.println("gecerli bir durum degil");
            }
        } else {
            aciliyet = false;
        }

        return hastaDurumu;

    }

    public static Hasta hastaBul(String aktuelDurum) {
        Hasta hasta = new Hasta();
        for (int i = 0; i < durumlar.length; ) {
            if (hasta.equals(VeriBankasi.durumlar[i])) {
                hasta.setIsim(hastaIsimleri[i]);
                hasta.setSoyIsim(hastaSoyIsimleri[i]);
                hasta.setHastaId(hastaIDleri[i]);

            }


        }
        return hasta;


    }
}