import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        //Variabel
        int jumlahLembar = 50; 
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        
        //Input
        int totalBiayaCetak = jumlahLembar * biayaPerLembar;
        int totalBayar = totalBiayaCetak + biayaJilid;
        
        //Output
        System.out.println("--- Perhitungan Biaya Cetak Dokumen ---");
        System.out.println("Jumlah Lembar Dokumen : " + jumlahLembar + " lembar");
        System.out.println("Biaya Cetak per Lembar: Rp " + biayaPerLembar);
        System.out.println("Biaya Penjilidan      : Rp " + biayaJilid);
        System.out.println("---------------------------------------");
        System.out.println("Total Biaya Cetak     : Rp " + totalBiayaCetak);
        System.out.println("Total Harus Dibayar   : Rp " + totalBayar);
    }
}