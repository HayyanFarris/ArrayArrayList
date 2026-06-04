package bagian3.perpustakaan;


public class MainPerpustakaan {

    public static void main(String[] args) {
// Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata",1990));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya",2012));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi",2023));
        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        
        System.out.println();
        perpus.tampilkanKoleksi();
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();
        
       perpus.tampilkanKoleksi();
       perpus.cariPenulis("Andrea Hirata");
       

        
    }
}
