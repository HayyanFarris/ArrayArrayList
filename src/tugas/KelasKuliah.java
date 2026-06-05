package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    
    
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    
    public void tampilkanSemua() {
        System.out.println("=== DATA MAHASISWA ===");
        int no = 1;
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(no + ". " + m.info());
            no++;
        }
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
