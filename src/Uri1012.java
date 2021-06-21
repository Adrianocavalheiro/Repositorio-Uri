import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pi = 3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        triangulo = A * C / 2;
        circulo = Math.pow(C, 2) * pi;
        trapezio = (A + B) * C / 2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


        scanner.close();
    }
}