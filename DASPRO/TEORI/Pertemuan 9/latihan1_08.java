import java.util.Scanner;

public class latihan1_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalJam = 0;

        for (int hari = 1; hari <= 7; hari++) {
            int jamBelajar;

            do {
                System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
                jamBelajar = sc.nextInt();

                if (jamBelajar > 10) {
                    System.out.println("Input tidak valid. Jam belajar tidak boleh lebih dari 10 jam dalam sehari.");
                    System.out.println("Silakan masukkan ulang.");
                }
            } while (jamBelajar > 10);

            totalJam += jamBelajar;
        }

        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");
        sc.close();
    }
}
