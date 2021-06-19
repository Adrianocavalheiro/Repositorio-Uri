import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double mediaA, mediaB, mediaC, mediaFinal;

        mediaA = A * 2.0 / 10.0;
        mediaB = B * 3.0 / 10.0;
        mediaC = C * 5.0 / 10.0;
        mediaFinal = mediaA + mediaB + mediaC;

        System.out.printf("MEDIA = %.1f%n", mediaFinal);



        scanner.close();
    }
}