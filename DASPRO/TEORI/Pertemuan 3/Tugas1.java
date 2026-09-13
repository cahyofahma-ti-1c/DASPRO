import java.util.Scanner;
public class Tugas1 { 

    public static void main(String[] args) { 
    
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan harga laptop: "); 
        int x = sc.nextInt();

        System.out.print("masukan uang muka: ");
        double y = sc.nextDouble();

        System.out.print("Masukan lama cicilan: ");
        int z = sc.nextInt();

        // Deklarasi Variabel
        // int x =15000000; //HargaLaptop
        // double y = 1000000; //UangMuka
        // int z = 15; //LamaCiciLlan
        

        double bunga = 8.02; //Bunga

        double sisaHarga = x - y;
        double hasilBagi = sisaHarga /z;
        double hasilBunga = bunga * sisaHarga;
        double JumlahBayar = hasilBagi + hasilBunga;

        System.out.println(" --- PERHITUNGAN CICILAN LAPTOP --- ");
        System.out.println("Harga Laptop        : Rp " + x);
        System.out.println("Uang Muka (DP)      : Rp " + y);
        System.out.println("Sisa Harga          : Rp " + (int) sisaHarga);
        System.out.println("Lama Cicilan        : Rp " + z + "bulan");
        System.out.println("Bunga per Bulan     : 2%");
        System.out.println(".............................");
        System.out.println("Cicilan Per Bulan   : Rp " + (int) JumlahBayar);

        sc.close();
    }
}
