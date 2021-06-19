import java.io.IOException;
import java.util.Scanner;

public class Uri1001 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /* FAZER SOMA
        Exemplos de Entrada	                Exemplos de Saída
        10                                  X = 19
        9

        -10                                 X = -6
        4

        15                                  X = 8
        -7
        */

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();

        int media = N1 + N2;

        System.out.println("X = " + media);
    }

}