package penilaian.form;

public class PenilaianMenulis {
    float hasil;
    float[] nilai_surat;

    public PenilaianMenulis(float[] nilai_surat) {

    }

    public float nilai(){
        hasil = nilai_surat[0]/100*10 + nilai_surat[1]/100*40 + nilai_surat[2]/100*30 + nilai_surat[3]/100*20;
        return hasil;
    }
}
