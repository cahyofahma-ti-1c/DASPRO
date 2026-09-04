import java.util.Scanner;

public class Segitiga08 {
    public static void main(String[] args) {
        
    Scanner sc = new java.util.Scanner(System.in);

    int alas, tinggi;
    float luas;

    System.out.println("Masukan alas: ");
        alas = sc.nextInt();
    System.out.println("Masukan tinggi: ");
        tinggi = sc.nextInt();

    luas = alas * tinggi / 2;
    System.out.println("Luas segitiga: " + luas);
    }
}