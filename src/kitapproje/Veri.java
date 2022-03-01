package kitapproje;

public class Veri {




    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private int no;
    private String ad;

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    private String yazarAdi;
    private int yayin;
    public Veri(){

    }

    public Veri(int no, String ad, String yazar, int yayin, double fiyat) {
        this.no=no;
        this.ad = ad;
        this.yazarAdi = yazar;
        this.yayin = yayin;
        this.fiyat = fiyat;
        
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }



    public int getYayin() {
        return yayin;
    }

    public void setYayin(int yayin) {
        this.yayin = yayin;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    private double fiyat;

    @Override
    public String toString() {
        return "Veri{" +
                "no=" + no +
                "ad='" + ad + '\'' +
                ", yazar='" + yazarAdi + '\'' +
                ", yayin=" + yayin +
                ", fiyat=" + fiyat +
                '}';
    }


}
