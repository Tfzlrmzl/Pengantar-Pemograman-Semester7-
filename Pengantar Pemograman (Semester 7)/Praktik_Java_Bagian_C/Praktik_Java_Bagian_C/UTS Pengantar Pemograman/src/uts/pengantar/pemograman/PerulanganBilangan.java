package uts.pengantar.pemograman;

public class PerulanganBilangan {
    public static void main(String[] args) {

        int total = 0;

        System.out.println("Bilangan dari 1 sampai 20:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + (i < 20 ? ", " : "\n"));

            total += i;
        }

        System.out.println("Jumlah keseluruhan: " + total);
    }
}