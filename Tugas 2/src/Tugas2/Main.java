package Tugas2;

import java.util.Scanner;
import Tugas2.Lingkaran;
import Tugas2.Balok;
import Tugas2.Tabung;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang = 'y';
        int pil;
        double jari_jari , tinggi_tabung , tinggi_balok , panjang , lebar;

        System.out.println("Muhammad Farhan");
        System.out.println("123200016");
        while(ulang == 'y' || ulang == 'Y'){
            System.out.println(" Menu Utama");
            System.out.println(" 1.Hitung Balok");
            System.out.println(" 2.Hitung Tabung");
            System.out.println(" 3.Exit");
            System.out.print(" Pilihan : "); pil = input.nextInt();

            switch (pil){
                case 1 :
                    System.out.print(" Masukan Tinggi  : "); tinggi_balok = input.nextDouble();
                    System.out.print(" Masukan Panjang : "); panjang = input.nextDouble();
                    System.out.print(" Masukan Lebar   : "); lebar = input.nextDouble();
                    Balok ambil = new Balok(tinggi_balok,panjang,lebar);
                    System.out.println("\n Hasil : \n");
                    System.out.println(" Keliling       : " + ambil.keliling());
                    System.out.println(" Luas           : " + ambil.luas());
                    System.out.println(" Volume         : " + ambil.volume());
                    System.out.println(" Luas Permukaan : " + ambil.luaspermukaan());
                    break;

                case 2 :
                    System.out.print(" Masukan Tinggi    : "); tinggi_tabung = input.nextDouble();
                    System.out.print(" Masukan Jari-jari : "); jari_jari = input.nextDouble();
                    Tabung take = new Tabung(jari_jari,tinggi_tabung);
                    System.out.println("\n Hasil : \n");
                    System.out.println(" Keliling       : " + take.keliling());
                    System.out.println(" Luas           : " + take.luas());
                    System.out.println(" Volume         : " + take.volume());
                    System.out.println(" Luas Permukaan : " + take.luaspermukaan());
                    break;

                case 3 :
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Pilihan tidak ada");
            }

            System.out.print(" Ulang(y/t) : "); ulang = input.next().charAt(0);
        }
    }
}
