import java.io.IOException;
import java.lang.reflect.Array;
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
        double media = media(v, tam);

        double des = desvio(v, tam, media);
        des = Math.sqrt(des);

        System.out.printf("%.1f\n", des);
    }

    public static double media(int[] v, int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + v[i];
        }
        double m = sum / n;

        return m;
    }

    public static double desvio(int[] v, int tam, double media) {

        double sum = 0;
        for (int i = 0; i < tam; i++) {

            sum = sum + Math.pow((v[i] - media), 2);

        }
        double des = sum / tam;
        return des;
    }
}
