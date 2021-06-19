import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double n = 3.14159;
        double valor1;
        double Area;

        valor1 = (raio * raio);

        Area = n * valor1;

        System.out.printf("A=%.4f%n", Area);
    }
}
