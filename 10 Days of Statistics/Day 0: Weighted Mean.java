import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int v[] = new int[tam];
        int v2[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = input.nextInt();
        }
        for (int i = 0; i < v2.length; i++) {
            v2[i] = input.nextInt();
        }
        int p = 0;
        float sum = 0;
        for (int i = 0; i < v2.length; i++) {
            p = v[i] * v2[i];
            sum = sum + p;
        }
        int deno = 0;
        for (int i = 0; i < v2.length; i++) {
            deno = deno + v2[i];
        }
        float res = sum / deno;
        String fim = String.format("%.1f", res);
        System.out.println(fim);
        input.close();
        System.exit(0);

    }

}
