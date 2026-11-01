import java.util.Scanner;
public class MenghitungLuasPersegiPanjang08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variable
        int panjang;
        int lebar;
        int luas;

        //Input
        System.out.print("Masukan panjang lapangan:");
        panjang = sc.nextInt();

        System.out.print("Masukan lebar lapangan:");
        lebar = sc.nextInt();

        //Proses
        luas = panjang*lebar;

        //Output
        System.out.println("Luas persegi panjang adalah:" + luas);

        sc.close();
    }
}