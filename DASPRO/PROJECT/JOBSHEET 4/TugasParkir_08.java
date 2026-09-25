import java.util.Scanner;

public class TugasParkir_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int LamaParkir;
        System.out.print("Lama Parkir (jam): ");
        LamaParkir = sc.nextInt();

        int TarifParkir;

        if (LamaParkir <= 2){
            TarifParkir = 2000;
        } else {
            TarifParkir = 2000 + (LamaParkir - 2) * 1000;
        }

        System.out.print("Tarif Parkir : "+ TarifParkir);
    }
}
