package Pertemuan3;

public class Pesanan {
    /* karena ini adalah class maka tidak ada 
    public static void main(String[] args) {} 
    public static hanya ada di program utama
    */

    // Membuat variabale di class menu
    String namaMakanan = "Nasi Goreng";
    int hargaMakanan = 15000;
    String deskripsiMakanan = "Sangat Pedas";

    public Pesanan() {
        // ini adalah constructor yang gunanya untuk inisialisasi 
        // inisialisasi sebelum java class ini dipakai
        // ketika dipanggil maka barulah class ini berjalan
        System.out.println("Selamat datang di restoran kami");
        System.out.println("Menu makanan: ");

        /*  untuk vscode membuat constructor, getter setter, dll.
            bisa install extension Java code generators.
            klik kanan>Java Code generators > empty generators */
    }

    public void tampilkanDataPesanan() {
        // ini sama seperti fungsi biasa pada java
        System.out.println("makanan: " + namaMakanan );
        System.out.println("harga: " + hargaMakanan );
        System.out.println("deskripsi: " + deskripsiMakanan + "\n");
    }

    public void ubahHargaMakanan(int hargaBaru) {
        // ini sama seperti fungsi tetapi dengan parameter sehingga bisa mengolah nilai
        hargaMakanan = hargaMakanan + hargaBaru;
    }

}
