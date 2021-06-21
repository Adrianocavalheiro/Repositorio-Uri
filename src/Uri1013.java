import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAb = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

        System.out.println(maiorABC + " eh o maior");



        scanner.close();
    }
}