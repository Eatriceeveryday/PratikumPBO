package tugas1;

public class konversi {
    float suhu;

    public konversi(float suhu){
        this.suhu = suhu;
    }
    float fahrenheit(){
        return((9*suhu)/5)+32;
    }

    float reamur(){
        return(4*suhu)/5;
    }
    double kelvin(){
        return suhu + 273.15;
    }

    void tampil(){
        System.out.println("Suhu dalam celcius : " + suhu + "C");
        System.out.println("Suhu dalam fahreinheit : " + fahrenheit() + "F");
        System.out.println("Suhu dalam reamur : " + reamur() + "R");
        System.out.println("Suhu dalam kelvin : " + kelvin() + "K");
    }

}
