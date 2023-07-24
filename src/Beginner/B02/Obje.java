package Beginner.B02;

public class Obje {

    int id;
    String isim;
    String soyisim;

    public Obje (int id, String isim, String soyisim){
        // this : şuan üzerinde çalıştığım class

        this.id = id;
        this.isim = isim;
        this.soyisim=soyisim;
    }

    public Obje (){
        System.out.println("test");
    }

    public Obje (int id){
    }

}
