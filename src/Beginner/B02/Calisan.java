package Beginner.B02;

public class Calisan {
  public int no;
  public String isim;
  public String soyisim;
  public double maas;
  public int tecrube;

  public Calisan(){

  }
  public Calisan(int no, String isim, String soyisim, int tecrube, double maas){
    this.no = no;
    this.isim = isim;
    this.soyisim = soyisim;
    this.maas = maas;
    this.tecrube = tecrube;
  }

  public void calisanBilgileriGoster(){
    System.out.println();
    System.out.println("****CALISAN BILGILERI****");
    System.out.println();
    System.out.println("No: " + no);
    System.out.println("İsim: " + isim);
    System.out.println("Soyisim: " + soyisim);
    System.out.println("Tecrübe: " + tecrube);
  }

  public void zamYap(int zamDegeri){
    System.out.println("Maaşınıza " + zamDegeri + "TL zam yapıldı");
    System.out.println("Güncel maaşınız: " + (maas+zamDegeri));
  }

  public void formatAt(String isletimSistemi, String kim){
    System.out.println(kim + " şu anda " + isletimSistemi + " işletim sistemine format atıyor");
  }

}
