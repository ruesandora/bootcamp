package Beginner.B02;

public class Obje {

    public int id;
    public String isim;
    public String soyisim;

    private String cinsiyet; // dış dünyaya kapalı.

    public Obje (int id, String isim, String soyisim){
        // this : şuan üzerinde çalıştığım class

        this.id = id;
        this.isim = isim;
        this.soyisim=soyisim;
    }


    public Obje(String p_cinsiyet){
        cinsiyet = p_cinsiyet;
    }

    public void cinsiyetYazdir(){
        System.out.println("Cinsiyet : " + this.cinsiyet);
    }

}
