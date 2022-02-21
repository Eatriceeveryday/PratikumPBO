package tugas1;
import tugas1.konversi;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        float suhu;
        char ulang = 'y';

        System.out.println("Muhammad Farhan");
        System.out.println("123200016\n\n");
        System.out.println("=========================");
        System.out.println("==Program Konversi Suhu==");
        System.out.println("=========================");
        System.out.print("Input Suhu : "); suhu = input.nextFloat();
        konversi ubah = new konversi(suhu);

        while (ulang == 'y' || ulang == 'Y'){
            System.out.println("   \nOpsi");
            System.out.println("-----------");
            System.out.println("1.Lihat Konversi data");
            System.out.println("2.Edit data");
            System.out.println("3.Exit");
            System.out.print("Pilihan : "); pil = input.nextInt();

            switch (pil){
                case 1 :
                    ubah.tampil();
                    break;

                case 2 :
                    System.out.print("Masukan suhu baru : "); ubah.suhu = input.nextFloat();
                    break;

                case 3 :
                    ulang = 't';
                    break;

                default:
                    System.out.println("Pilihan Tidak ada");
            }

        }
    }
}
