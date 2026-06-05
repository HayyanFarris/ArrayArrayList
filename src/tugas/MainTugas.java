package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Membuat objek pengelola
        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        System.out.println();

        // Membuat objek Mahasiswa lalu memasukkannya ke daftarMahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231002", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231003", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "231004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "231005", 40));

        kelas.tampilkanSemua();

        System.out.println();

        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        System.out.println();

        // Menambahkan mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "231006", 90));

        System.out.println("Setelah menambah mahasiswa baru:");
        System.out.println("Jumlah data mahasiswa : " + kelas.jumlahMahasiswa());

        System.out.println();

        
        kelas.tampilkanSemua();

        System.out.println();
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
    }
}
