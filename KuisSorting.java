/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis.sorting;
import java.util.Scanner;

class Barang {
    String nama;
    double harga;

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class KuisSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

        Barang[] barangArray = new Barang[jumlahBarang];

        // Input data barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Barang ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();

            barangArray[i] = new Barang(nama, harga);
        }

        // Mengurutkan berdasarkan harga tertinggi
        bubbleSortByHighestPrice(barangArray);
        System.out.println("\nBarang diurutkan berdasarkan harga tertinggi:");
        printBarang(barangArray);

        // Mengurutkan berdasarkan harga terendah
        bubbleSortByLowestPrice(barangArray);
        System.out.println("\nBarang diurutkan berdasarkan harga terendah:");
        printBarang(barangArray);

        // Mengurutkan berdasarkan abjad (nama)
        bubbleSortByAlphabet(barangArray);
        System.out.println("\nBarang diurutkan berdasarkan abjad (nama):");
        printBarang(barangArray);
    }

    // Bubble sort untuk mengurutkan barang berdasarkan harga tertinggi
    private static void bubbleSortByHighestPrice(Barang[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].harga < arr[i].harga) {
                    // Tukar elemen jika urutannya salah
                    Barang temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Bubble sort untuk mengurutkan barang berdasarkan harga terendah
    private static void bubbleSortByLowestPrice(Barang[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].harga > arr[i].harga) {
                    // Tukar elemen jika urutannya salah
                    Barang temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Bubble sort untuk mengurutkan barang berdasarkan abjad (nama)
    private static void bubbleSortByAlphabet(Barang[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].nama.compareTo(arr[i].nama) > 0) {
                    // Tukar elemen jika urutannya salah
                    Barang temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Metode untuk mencetak data barang
    private static void printBarang(Barang[] arr) {
        for (Barang barang : arr) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }
    }
}
