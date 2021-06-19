import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double comissao, salario;

        comissao = B * 0.15;
        salario = A + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salario);


        scanner.close();
    }
}