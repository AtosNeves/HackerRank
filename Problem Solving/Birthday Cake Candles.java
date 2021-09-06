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

        Arrays.sort(v);

        int q = 0;
        int m = v[testes - 1];
        for (int i = 0; i < testes; i++) {

            if (v[i] == m) {
                q = q + 1;
            }

        }
        System.out.println(q);
        input.close();
        System.exit(0);
    }
}
