import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = input.nextInt();
        }
        Arrays.sort(v);
        float media = 0;
        for (int i = 0; i < tam; i++) {
            media = media + v[i];
        }
        media = media / tam;
        String mres = String.format("%.1f", media);
        System.out.println(mres);
        int m = tam - 1;
        if (tam % 2 == 0) {

            float res = v[(m / 2)] + v[(m / 2 + 1)];
            res = res / 2;
            String mediana = String.format("%.1f", res);
            System.out.println(mediana);
        } else {
            System.out.println(v[tam / 2]);
        }
        int verifica = 0;

        int o = 0;
        int n = -1;
        int mm = -1;
        for (int i = 0; i < tam; i++) {
            verifica = v[i];

            n = 0;
            for (int j = 0; j < tam; j++) {

                if (verifica == v[j]) {
                    n = n + 1;
                }
            }
            if (n > o) {
                o = n;
                mm = verifica;
            }

        }
        if (n == -1) {
            System.out.println(v[0]);
        } else {
            System.out.println(mm);
        }

        input.close();
        System.exit(0);

    }

}
