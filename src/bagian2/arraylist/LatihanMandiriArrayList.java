package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {

    public static void main(String[] args) {
        //1. Buat ArrayList<String> daftar belanja. Tambah 4 item, lalu hapus item ke-2, lalu tampilkan isi list beserta jumlah akhirnya.
        //2. Buat ArrayList<Integer> berisi 5 angka. Tampilkan nilai terbesar dengan menelusuri seluruh elemen.
        //3. Buat program yang menambah 6 nama ke dalam ArrayList, lalu cetak hanya nama yang diawali huruf A(gunakan method startsWith pada String

        //Soal No 1
        System.out.println("Bahan Belanjaan");
        ArrayList<String> item = new ArrayList<>();
        item.add("Penghapus");
        item.add("Penggaris");
        item.add("Sapu");
        item.add("Pulpen");
        item.remove("Penggaris");
        System.out.println("Isi List : " + item);
        System.out.println("Jumlah Akhir : " + item.size());
        System.out.println("");
        
        //Soal No 2
        System.out.println("Angka Tertinggi");
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(0, 80);
        angka.add(1, 55);
        angka.add(2, 70);
        angka.add(3, 88);
        angka.add(4, 90);

        int max = angka.get(0);
        for (int a : angka) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Nilai Terbesar Adalah : " + max);
        System.out.println("");
    
        //Soal No 3
        System.out.println("Nama Di Awali Huruf A");
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Ferdi");
        nama.add("Ahmad");
        nama.add("Abel");
        nama.add("Rosyid");
        nama.add("Ayi");
        nama.add("Hayyan");
        
        for(String n : nama){
            if(n.startsWith("A")){
                System.out.println("Nama Yang Di Awali Huruf A : "+ n);
            }
        }
        
        

    }
}
