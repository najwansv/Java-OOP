package Pertemuan1;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Hello disini kelas komandro");
        System.out.println("Kita belajar basic programming");
        System.err.println("namajuga");
        /*
        String = kalimat huruf
        int = untuk angka bulat
        double = untung angka desimal (dengan koma)
        boolean = untuk true or false
        */

        String namaLengkap;
        namaLengkap = "Muhammad najwan sulvadli";
        System.out.println("nama lengkapnya adalah "+ namaLengkap);

        int umur = 21;
        System.out.println("umurnya adalah "+ umur);

        double nilai = 1.0;
        System.out.println("nilai nya adalah " + nilai);

        boolean apakahWni = false;
        System.out.println("Apakah "+ namaLengkap + " WNI ?" + apakahWni);
        System.out.println("===============================");
        
        if (umur >= 20) {
            System.out.println("umur anda cukup");
        } else {
            System.out.println("umur anda tidak cukup");
        }
        System.out.println("===============================");
        
        if (nilai >= 90) {
            System.out.println("selamat kamu lulus");
        } else if (nilai >= 70) {
            System.out.println("kamu harus mengulang");
        } else if (nilai == 1) {
            System.out.println("kamu sudah berusaha, api tetap harus ikut kelas tambahan");
        } else {
            System.out.println("kamu harus ikut kelas tambahan");
        }
        System.out.println("===============================");
        
        if (namaLengkap.equals("Muhammad najwan sulvadli")) {
            System.out.println("kamu dapat fasilitas khusus");
        } else {
            System.out.println("kamu dapat fasilitas biasa");
        }
        System.out.println("===============================");
        
        if (apakahWni == true) {
            System.out.println("dapat fasiitas indonesia");
        } else {
            System.out.println("dapat fasiitas Non indonesia");
        }
    }
}
