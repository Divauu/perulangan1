package Perulangan;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = input.nextInt();

        int i = 1;
        int harga = 0;
        int jumlahBarang = 0;
        int totalPembelian = 0;
        while (jumlahItem >=i){

        System.out.println(i + ". " + "Nama Barang: ");
        String namaBarang = input.next();

        System.out.println(i + ". " + "Harga: ");
        harga = input.nextInt();

        System.out.println(i + ". " + "Jumlah: ");
        jumlahBarang = input.nextInt();
        System.out.println("=======================");

        totalPembelian += harga*jumlahBarang;
        i++;
    }
    System.out.println("Jumlah item yang dibeli: "+jumlahItem);
    System.out.println("Total Pembelian: "+totalPembelian);
    }

}
