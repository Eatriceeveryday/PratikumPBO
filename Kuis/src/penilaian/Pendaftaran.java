package penilaian;

import java.util.Scanner;

public class Pendaftaran {
    String nama , asal;

    public Pendaftaran(){
        Scanner baca = new Scanner(System.in);
        System.out.println("===Form Pendaftaran===");
        System.out.print("Input Nama : ");
        nama = baca.nextLine();
        System.out.print("Asal Sekolah : ");
        asal = baca.nextLine();
    }
}
