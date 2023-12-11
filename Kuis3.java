/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis2;

import java.util.Scanner;
public class Kuis2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        string barang; 
        System.out.println("Masukkan Barang");
        System.out.println("1. Lampu\n2. Senter ");
        System.out.println("3. Baterai\n4. Kabel");
        int count=0;
            System.out.print("Cari Barang = ");
            int cari = s.nextInt();
            boolean ketemu = false;
            if(ketemu==true){
                System.out.print("Barang Ditemukan");
                ketemu = true;
            } 
            else {
                System.out.println("Barang tidak ditemukan");    
            }
            System.out.println("Cari lagi?");
            System.out.println("[1.Ya][2.Tidak]");
            System.out.print("Jawab = ");
            int pilih = s.nextInt();
    } 
}

