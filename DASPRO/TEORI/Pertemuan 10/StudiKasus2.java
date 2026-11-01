import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < i; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print ("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print (" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print ("*");
            }
            System.out.println();
        }
    }
}