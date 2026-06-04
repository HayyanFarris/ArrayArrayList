package bagian1.array;

public class LatihanMandiriArray {

    public static void main(String[] args) {
        //Soal No 1
        System.out.println("Suhu Tertinggi dan Terendah");
        double[] suhu = {30.0, 40.0, 40.8, 37.7, 35.9, 38.7};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }

        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah : " + min);

        System.out.println("");

        //Soal No 2
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Minggu"};
        System.out.println("Hari Yang Lebih Dari 5 Huruf");
        int batas = 5;
        for (String h : hari) {
            if (h.length() > batas) {
                System.out.println(h);

            }
        }
        System.out.println("");
        //Soal No 3
        System.out.println("Angka Bilangan Genap");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for(int g : angka) {
            if(g%2 == genap){
                System.out.println(g);
            }

        }
    }

}
