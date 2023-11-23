package ProgramDay;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Selamat datang, " + namaMahasiswa + "!");

        // Input nilai mahasiswa
        System.out.print("Masukkan nilai mahasiswa: ");
        double nilaiMahasiswa = scanner.nextDouble();

        // Menampilkan nilai mahasiswa
        System.out.println("Nilai mahasiswa untuk " + namaMahasiswa + " adalah: " + nilaiMahasiswa);

        // Menentukan status kelulusan
        if (nilaiMahasiswa >= 60) {
            System.out.println(namaMahasiswa + " dinyatakan LULUS.");
        } else {
            System.out.println(namaMahasiswa + " dinyatakan TIDAK LULUS.");
        }
    }
}
