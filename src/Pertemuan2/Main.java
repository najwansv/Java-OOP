package Pertemuan2;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        String kelas = "Basic Programming";

        intro(kelas);
        
        ArrayList<String> namaLengkap = new ArrayList<>();
        ArrayList<Integer> umur = new ArrayList<>();

        namaLengkap.add("najwan sulvadli");
        umur.add(12);

        namaLengkap.add("John wick");
        umur.add(29);

        namaLengkap.add("Ojan");
        umur.add(13);
        
        tampilkanManual(namaLengkap, umur);

        System.out.println("=======================");
        
        tampilkanAutomatis(namaLengkap, umur);

        int panjang = 50;
        int lebar = 30;

        int hasil = hitungLuaspersegiPanjang(panjang, lebar);

        System.out.println("Hasil luas = " + hasil);
    }

    public static int hitungLuaspersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;

        return luas;
    }

    public static void intro(String kelasKomandro) {
        System.out.println("halo, selamat datang di kelas komandro " + kelasKomandro);
    }
    
    public static void tampilkanManual(ArrayList<String> namaLengkap, ArrayList<Integer> umur) {
        System.out.println("Nama : " + namaLengkap.get(0));
        System.out.println("Umur : " + umur.get(0));

        System.out.println("Nama : " + namaLengkap.get(1));
        System.out.println("Umur : " + umur.get(1));

        System.out.println("Nama : " + namaLengkap.get(2));
        System.out.println("Umur : " + umur.get(2));

    }

    public static void tampilkanAutomatis(ArrayList<String> namaLengkap, ArrayList<Integer> umur) {
        for( int urutan = 0 ; urutan < 3 ; urutan++ ){
            System.out.println("perulangan ke : " + urutan);
            System.out.println("nama : " + namaLengkap.get (urutan));
            System.out.println("Umur : " + umur.get(urutan));
        }
        System.out.println("perulangan selesai");
    }

}
