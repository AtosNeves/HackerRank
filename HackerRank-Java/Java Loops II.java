import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes;
        testes = input.nextInt();
        int a, b, n;
        int m = 1;

        Double r;
        double r1;
        for (int k = 1; k <= testes; k++) {
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();
            r1 = Math.pow(2, 0) * b;

            double soma = b + a;
            for (int i = 0; i < n; i++) {

                for (int j = 1; j < m; j++) {

                    r = Math.pow(2, j) * b;
                    soma = soma + r;
                }

                m = m + 1;
                // soma = soma + a;
                String result = String.format("%.0f", soma);
                System.out.print(result + " ");
                soma = a + b;

            }
            System.out.println();
            m = 1;
        }

    }
}

