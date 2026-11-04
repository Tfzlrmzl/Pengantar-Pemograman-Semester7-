package uts.pengantar.pemograman;

import java.util.Scanner;

public class ProgramBiodataMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== BIODATA MAHASISWA ===");

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Program Studi: ");
        String prodi = input.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = Integer.parseInt(input.nextLine());

        System.out.print("Masukkan IPK: ");
        String ipkInput = input.nextLine().replace(',', '.');
        double ipk = Double.parseDouble(ipkInput);

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Semester      : " + semester);
        System.out.printf("IPK           : %.2f%n", ipk);

        input.close();
    }
}