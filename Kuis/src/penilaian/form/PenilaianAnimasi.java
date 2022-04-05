package penilaian.form;

import java.util.Scanner;

public class PenilaianAnimasi {
    float hasil;
    float[] nilai;

    public PenilaianAnimasi(float[] nilai){

    }

    public float nilai(){
        hasil = nilai[0]/100*15 + nilai[1]/100*35 + nilai[2]/100*35 + nilai[3]/100*15;
        return hasil;
    }

}
