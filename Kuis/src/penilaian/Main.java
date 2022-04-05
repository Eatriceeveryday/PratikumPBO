package penilaian;

import penilaian.form.PenilaianAnimasi;
import penilaian.form.PenilaianMenulis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lomba Apresiasi Pahlawan Wanita oleh UPNYK");
        System.out.println("Terdapat 2 kategori perlombaan : ");
        System.out.println("    1.Animasi(TIM)");
        System.out.println("    2.Menulis Surat(Individu)");

        Scanner baca = new Scanner(System.in);
        System.out.print("\nPilih Kategori Perlombaan : "); int lomba = baca.nextInt();

        Pendaftaran daftar = new Pendaftaran();
        switch (lomba){
            case 1 :
                String[] kategori = {"Alur Cerita" , "Konten" , "Kreativitas" , "Sinematografi" };
                float[] nilai = new float[4];

                for (int a = 0 ; a< kategori.length ; a++){
                    System.out.print("Input Nilai " + kategori[a] + " : " ); nilai[a] = baca.nextInt();
                    if (nilai[a] > 100 || nilai[a] < 0){
                        a--;
                    }
                }

                PenilaianAnimasi anim = new PenilaianAnimasi(nilai);
                boolean ulang = true;
                int pil;
                String ket , ket2;
                while (ulang == true){
                    System.out.println("\nMenu : ");
                    System.out.println("1.Tampil");
                    System.out.println("2.Edit");
                    System.out.println("3.Exit");
                    System.out.print("Pilih : "); pil = baca.nextInt();

                    switch (pil){
                        case 1 :
                            System.out.println("Nilai Akhir : " + anim.nilai() );
                            if(anim.nilai()>= 85) {
                                ket = "Lolos";
                                ket2 = "Selamat! Tim " + daftar.nama + " dari " + daftar.asal + "Lolos Seleksi Lomba animasi";
                            }
                            else {
                                ket = "Gagal";
                                ket2 = "Mohon Maaf, Tim " + daftar.nama + " dari " + daftar.asal + "Tidak Lolos Seleksi Lomba animasi";
                            }
                            System.out.println("Keterangan : " + ket);
                            System.out.println(ket2);
                            break;

                        case 2 :
                            for (int a = 0 ; a< kategori.length ; a++){
                                System.out.print("Input Nilai " + kategori[a] + " : " ); nilai[a] = baca.nextInt();
                                if (nilai[a] > 100 || nilai[a] < 0){
                                    a--;
                                }
                            }

                            PenilaianAnimasi baru = new PenilaianAnimasi(nilai);
                            break;

                        case 3 :
                            ulang = false;
                    }
                }
                break;

            case 2 :
                String[] kategorisurat = {"Struktur Surat" , "Isi Surat" , "Kreativitas" , "Kaidah bahasa" };
                float[] nilai_surat = new float[4];

                for (int a = 0 ; a< kategorisurat.length ; a++){
                    System.out.print("Input Nilai " + kategorisurat[a] + " : " ); nilai_surat[a] = baca.nextInt();
                    if (nilai_surat[a] > 100 || nilai_surat[a] < 0){
                        a--;
                    }
                }

                PenilaianMenulis surat = new PenilaianMenulis(nilai_surat);
                boolean ulang1 = true;
                while (ulang1 == true){
                    System.out.println("\nMenu : ");
                    System.out.println("1.Tampil");
                    System.out.println("2.Edit");
                    System.out.println("3.Exit");
                    System.out.print("Pilih : "); pil = baca.nextInt();

                    switch (pil){
                        case 1 :
                            System.out.println("Nilai Akhir : " + surat.nilai() );
                            if(surat.nilai()>= 85) {
                                ket = "Lolos";
                                ket2 = "Selamat! Tim " + daftar.nama + " dari " + daftar.asal + "Lolos Seleksi Lomba menulis";
                            }
                            else {
                                ket = "Gagal";
                                ket2 = "Mohon Maaf, Tim " + daftar.nama + " dari " + daftar.asal + "Tidak Lolos Seleksi Lomba menulis";
                            }
                            System.out.println("Keterangan : " + ket);
                            System.out.println(ket2);
                            break;

                        case 2 :
                            for (int a = 0 ; a< kategorisurat.length ; a++){
                                System.out.print("Input Nilai " + kategorisurat[a] + " : " ); nilai_surat[a] = baca.nextInt();
                                if (nilai_surat[a] > 100 || nilai_surat[a] < 0){
                                    a--;
                                }
                            }

                            PenilaianAnimasi baru = new PenilaianAnimasi(nilai_surat);
                            break;

                        case 3 :
                            ulang1 = false;
                    }
                }
                break;

            default:
                System.out.println("Lombanya tidak ada");
        }


    }
}
