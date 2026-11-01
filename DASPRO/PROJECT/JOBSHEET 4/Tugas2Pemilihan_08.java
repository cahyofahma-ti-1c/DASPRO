import java.util.Scanner;

public class Tugas2Pemilihan_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSKS;
        System.out.print("Masukan jumlah SKS: ");
        jumlahSKS = sc.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}