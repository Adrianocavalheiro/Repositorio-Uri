import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        double C = scanner.nextDouble();
        double salario;

        salario = B * C;

        System.out.println("NUMBER = " + A);
        System.out.printf("SALARY = U$ %.2f%n", salario);


        scanner.close();
    }
}