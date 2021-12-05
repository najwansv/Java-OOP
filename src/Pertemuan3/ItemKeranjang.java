package Pertemuan3;

public class ItemKeranjang {
    // membuat variable

    String namaBarang;
    int hargaBarang;
    int Qty;
    String note;

    // membuat cnstructor
    /*  jika ingin memasukkan semua var bisa menggunakan extension Java code generators.
        klik kanan>Java Code generators > generate construction using all field
        nanti akan automatis mengetik seperti ini  */
    public ItemKeranjang(String namaBarang, int hargaBarang, int Qty, String note) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.Qty = Qty;
        this.note = note;
    }

    /*  ini adalah getter and setter 
        nah gunanya getter dan setter ini untuk mengambil data dan mengisi data ke dalam object atau class
        cara nya sama
        klik kanan>Java Code generators > generate getter and setter*/
        
    public String getNamaBarang() {
        return this.namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return this.hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getQty() {
        return this.Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
