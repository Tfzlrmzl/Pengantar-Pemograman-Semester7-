package uts.pengantar.pemograman;

import java.util.Scanner;

public class MenentukanGanjilGenap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENENTUKAN BILANGAN GANJIL ATAU GENAP ===");

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        input.close();
    }
}