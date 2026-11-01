import java.util.Scanner;

public class StudiKasus1_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double gajiPokok;
        int jumlahAnak;
        double tunjanganPerAnak;
        double persenPensiun = 0.10;        // potongan dana pensiun 10%
        double totalTunjangan;
        double potonganPensiun;
        double gajiBersih;

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        // Input jumlah anak
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        // Input tunjangan per anak
        System.out.print("Masukan tunjangan per anak");
        tunjanganPerAnak = input.nextDouble();

        // Proses
        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = persenPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        // Output
        System.out.println("Total tunjangan anak : Rp" + totalTunjangan);
        System.out.println("Potongan pensiun     : Rp" + potonganPensiun);
        System.out.println("Gaji bersih Pak Danur: Rp" + gajiBersih);

        input.close();
    }
}