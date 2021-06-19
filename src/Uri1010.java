import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codPecas1 = scanner.nextInt();
        int numPecas1 = scanner.nextInt();
        double valPecas1 = scanner.nextDouble();
        int codPecas2 = scanner.nextInt();
        int numPecas2 = scanner.nextInt();
        double valPecas2 = scanner.nextDouble();

        double total = numPecas1 * valPecas1 + numPecas2 * valPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


        scanner.close();
    }
}