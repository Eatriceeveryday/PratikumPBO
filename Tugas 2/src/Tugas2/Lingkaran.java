package Tugas2;

public class Lingkaran implements MenghitungBidang {
    private double phi = 3.14 , jari_jari;

    public Lingkaran(double jari_jari){
        this.jari_jari = jari_jari;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double luas(){
      return phi*jari_jari*jari_jari;
    }

    public double keliling(){
        return 2*phi*jari_jari;
    }

}
