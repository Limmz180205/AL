public class ParkirSebelum {
    public static void main(String[] args) {   // 👈 INI BAGIAN MAIN
        // Input data kendaraan
        String plat = "N1234CD";
        int jamMasuk = 8;
        int jamKeluar = 12;

        // Hitung lama parkir
        int lama = Lamaparkirr(jamKeluar, jamMasuk);

        // Hitung biaya parkir
        int biaya = 0;
        if (lama <= 2) {
            biaya = lama * 2000;
        } else {
            biaya = 4000 + (lama - 2) * 1000;
        }

        // Tampilkan informasi parkir
        System.out.println("Plat Nomor: " + plat);
        System.out.println("Lama Parkir: " + lama + " jam");
        System.out.println("Biaya Parkir: Rp" + biaya);
        System.out.println("Abdul Halim");
    }

    private static int Lamaparkirr(int jamKeluar, int jamMasuk) {
        int lama = jamKeluar - jamMasuk;
        return lama;
    }

}
