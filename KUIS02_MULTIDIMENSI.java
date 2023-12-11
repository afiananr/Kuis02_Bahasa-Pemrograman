/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis02_multidimensi;

/**
 *
 * @author HP
 */
public class KUIS02_MULTIDIMENSI {
    public static void main(String[] args) {
        String[][] daftarBarang = {
            {"Pensil", "4000"},
            {"Buku", "5000"},
            {"Cat air", "56000"},
            {"Penghapus", "3000"},
            {"Spidol","12000"},
        };
        System.out.println("DAFTAR GUDANG TOKO BUKU HIKMAH");
        System.out.println(" ");
        for (String[] barang : daftarBarang) {
            System.out.println(barang[0] + " dengan Harga: Rp" + barang[1]);
        }
    }
}