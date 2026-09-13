import java.util.Scanner;
public class MenghitungTotalBayar08{

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        //Variabel
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        //Input
        System.out.print("Masukan harga: ");
        harga = sc.nextInt();

        //Proses
        potongan = diskon*harga;
        jml_bayar = harga - potongan;

        //Output
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);
    }
}