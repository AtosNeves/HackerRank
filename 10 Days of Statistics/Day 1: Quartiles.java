import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int tam = input.nextInt();
            int v[] = new int[tam + 1];
            for (int i = 0; i < tam; i++) {
                v[i] = input.nextInt();
            }
            Arrays.sort(v);

            double q1 = q1(v, tam);
            double q2 = q2(v, tam);
            double q3 = q3(v, tam);
            System.out.printf("%.0f\n", q1);
            System.out.printf("%.0f\n", q2);
            System.out.printf("%.0f\n", q3);

            input.close();
            System.exit(0);

        }
    }

    public static double q1(int[] v, int n) {

        // n = n + 1;
        int quadro1 = (int) Math.round(0.25 * (n + 1));

        if (n % 2 == 1) {
            return (v[quadro1] + v[quadro1 - 1]) / 2;
        } else {
            return v[Math.round(n / 4 + 1)];
        }
    }

    public static double q2(int[] v, int n) {

        int quadro2 = (int) Math.round(0.5 * (n + 1));

        if (n % 2 == 1) {

            return (v[Math.round(n / 2 + 1)]);
        } else {

            return (v[n / 2] + v[n / 2 + 1]) / 2;
        }
    }

    public static double q3(int[] v, int n) {

        int quadro3 = (int) Math.floor(0.75 * (n + 1));

        if (n % 2 == 1) {

            return (v[quadro3] + v[quadro3 + 1]) / 2;
        } else {
            if ((n / 2) % 2 == 1) {

                int m = n;
                m = Math.round(n / 4);

                return v[n - m];
            } else {
                return (v[quadro3] + v[quadro3 + 1]) / 2;
            }
        }
    }

}
