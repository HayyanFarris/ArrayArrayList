package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
// ArrayList yang menampung objek bertipe Buku

    private ArrayList<Buku> koleksi = new ArrayList<>();
// Menambah satu buku ke koleksi

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }
// Menampilkan seluruh koleksi beserta nomor urut

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
    }

// Mencari buku berdasarkan judul, lalu menandainya dipinjam
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }
// Menghitung jumlah buku yang masih tersedia

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }

// Mengembalikkan Buku(Soal No 1)
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {

                if (b.isDipinjam()) {
                    b.setDipinjam(false);
                    System.out.println(judul + " sedang dikembalikan.");
                } else {
                    System.out.println(judul + " berhasil dikembalikan.");
                }

                return;
            }
        }

        System.out.println("Buku " + judul + " tidak ditemukan.");
    }
    
    //Mencari Karya Penulis berdasarkan nama penulis (Soal 3)
    public void cariPenulis(String penulis){
        for(Buku b : koleksi){
            if(b.getPenulis().equals(penulis)){
                System.out.println("Nama Pengarang :"+ b.getPenulis());
                System.out.println("Buku :"+ b.getJudul());
                System.out.println("Tahun Terbit : "+ b.getTahunTerbit() );
            
            }
            
        
        }
    }
}
