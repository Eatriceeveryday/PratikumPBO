package Tugas2;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double tinggi , double panjang , double lebar){
        super(panjang , lebar);
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

    public double luaspermukaan(){
        return 2*getPanjang()*getLebar()+2*getPanjang()*tinggi+2*getLebar()*tinggi;
    }
}
