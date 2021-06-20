import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double R = scanner.nextDouble();
        double pi = 3.14159;
        double raio, resultado;
        raio = Math.pow(R,3);

        resultado = (4.0 / 3.0) * pi * raio;

        System.out.printf("VOLUME = %.3f%n", resultado);

        scanner.close();
    }
}