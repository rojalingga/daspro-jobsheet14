package Rekursif;
import java.util.Scanner;

public class Tugas {
    static int hitungRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0;
        } else {
            return angka[n - 1] + hitungRekursif(angka, n - 1);
        }
    }

    static int hitungIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlAngka, totalRekursif, totalIteratif;

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        jmlAngka = sc.nextInt();

        int[] angka = new int[jmlAngka];

        for (int i = jmlAngka; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        totalRekursif = hitungRekursif(angka, jmlAngka);
        System.out.println("Total menggunakan rekursif: " + totalRekursif);

        totalIteratif = hitungIteratif(angka, jmlAngka);
        System.out.println("Total menggunakan iteratif: " + totalIteratif);
    }
}
