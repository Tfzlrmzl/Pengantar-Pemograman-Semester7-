package uts.pengantar.pemograman;

import java.util.Scanner;

public class MenghitungRataRataNilai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;

        System.out.println("=== MENGHITUNG RATA-RATA 5 NILAI ===");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");

            double nilai = Double.parseDouble(
                input.nextLine().replace(',', '.')
            );

            total += nilai;
        }

        double rataRata = total / 5;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total nilai    : " + total);
        System.out.printf("Rata-rata nilai: %.2f%n", rataRata);

        input.close();
    }
}