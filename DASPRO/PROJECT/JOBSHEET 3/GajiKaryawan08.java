import java.util.Scanner;
public class GajiKaryawan08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variabel
        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTransp = 600000;
        double tunjanganMakan = 400000;

        //Input
        System.out.print("Masukan gaji pokok: ");
        gajiPokok = sc.nextInt();

        //Proses
        bonus = 0.05*gajiPokok;
        totalGaji = gajiPokok + tunjanganMakan + tunjanganTransp + bonus - (0.1*gajiPokok);

        //Output
        System.out.println("Bonus bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang anda terima adalah Rp. "+totalGaji);

        sc.close();
    }
}