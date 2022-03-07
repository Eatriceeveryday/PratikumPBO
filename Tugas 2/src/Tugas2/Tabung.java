package Tugas2;

public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi ;

    public Tabung (double jari_jari , double tinggi) {
        super(jari_jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double volume(){
        return luas()*tinggi;
    }

    public  double luaspermukaan(){
        return 2*luas() + getJari_jari()*tinggi;
    }
}
