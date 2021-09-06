import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int v[] = new int[testes];
        for (int i = 0; i < testes; i++) {
            v[i] = input.nextInt();
        }
        float n = 0, p = 0, z = 0;
        for (int i = 0; i < testes; i++) {
            if (v[i] < 0) {
                n = n + 1;
            }
            if (v[i] > 0) {
                p = p + 1;
            }
            if (v[i] == 0) {
                z = z + 1;
            }

        }
        n = n / testes;
        z = z / testes;
        p = p / testes;
        System.out.printf("%.6f\n",p);
        System.out.printf("%.6f\n",n);
        System.out.printf("%.6f\n",z);
        input.close();
        System.exit(0);
    }
}
