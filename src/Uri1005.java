import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double mediaA, mediaB, mediaFinal;

        mediaA = A * 3.5 / 11.0;
        mediaB = B * 7.5 / 11.0;
        mediaFinal = mediaA + mediaB;

        System.out.printf("MEDIA = %.5f%n", mediaFinal);



        scanner.close();
    }
}