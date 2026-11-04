
package uts.pengantar.pemograman;

import java.util.Scanner;

public class MenentukanNilaiHuruf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENENTUKAN NILAI HURUF ===");

        System.out.print("Masukkan nilai angka (0-100): ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid!");
        } else if (nilai >= 85) {
            System.out.println("Nilai huruf: A");
        } else if (nilai >= 75) {
            System.out.println("Nilai huruf: B");
        } else if (nilai >= 65) {
            System.out.println("Nilai huruf: C");
        } else if (nilai >= 50) {
            System.out.println("Nilai huruf: D");
        } else {
            System.out.println("Nilai huruf: E");
        }

        input.close();
    }
}
