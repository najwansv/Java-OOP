package Pertemuan3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // memanggil java class dengan memanggil constructornya
        // jadi seolah kita memiliki 1 variable yang berisi semua function di Pesanan.java
        Pesanan bukuMenu = new Pesanan();
        
        // memanggil tampilkanDataPesanan dengan memanggil variable dan function di Pesanan.java
        bukuMenu.tampilkanDataPesanan();

        // memanggil ubahHargaMakanan, yang didalam kurung adalah parameter int hargaBaru
        bukuMenu.ubahHargaMakanan(2000);
        bukuMenu.tampilkanDataPesanan(); // dipanggil lagi untuk merubahnya

        System.out.println("=================");
        // memanggil constuctornya dan variable nya
        // namun disini kita langsung mengisi variable tersebut
        ItemKeranjang varItem = new ItemKeranjang("meja", 300000, 2, "meja Kasir");
        System.out.println("nama barang : " + varItem.getNamaBarang());
        System.out.println("harga barang : " + varItem.getHargaBarang());
        System.out.println("qty : " + varItem.getQty());
        System.out.println("note : " + varItem.getNote());
        
        System.out.println("=================");
        // bisa juga menggunakan Array list dan perulangan for sehingga tidak perlu menulis banyak seperti diatas

        ArrayList<ItemKeranjang> listBarangKeranjang = new ArrayList<>();

        listBarangKeranjang.add(new ItemKeranjang("Kursi", 90000, 2, "merah"));
        listBarangKeranjang.add(new ItemKeranjang("Sendok", 12000, 20, "untuk pembeli"));
        listBarangKeranjang.add(new ItemKeranjang("Wajan", 150000, 1, "Baru"));

        // perulangan for, sama seperti di pertemuan sebelumnya
        for(int urutan = 0; urutan < listBarangKeranjang.size() ; urutan++){
            
            System.out.println("nama barang : " + listBarangKeranjang.get(urutan).getNamaBarang());
            System.out.println("harga barang : " + listBarangKeranjang.get(urutan).getHargaBarang());
            System.out.println("qty : " + listBarangKeranjang.get(urutan).getQty());
            System.out.println("note : " + listBarangKeranjang.get(urutan).getNote());
            System.out.println("=================");
        }
    }
}
