import java.util.Scanner;

public class Uri1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int resultado;

        resultado = X * Y;

        System.out.println("PROD = " + resultado);

        scanner.close();
    }
}