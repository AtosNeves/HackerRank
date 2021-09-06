import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int m[][] = new int[testes][testes];

        for (int i = 0; i < testes; i++) {
            for (int j = 0; j < testes; j++) {
                m[i][j] = input.nextInt();
            }
        }
        int soma = 0;
        for (int i = 0; i < testes; i++) {
            for (int j = 0; j < testes; j++) {
                if (i == j) {
                    soma = soma + m[i][j];
                }
            }
        }
        int soma2 = 0;
        int d = testes - 1;

        for (int i = 0; i < testes; i++) {
            for (int j = 0; j < testes; j++) {

                if (j == d) {
                    soma2 = soma2 + m[i][d];
                    d = d - 1;

                }
            }
        }

        System.out.println(Math.abs(soma - soma2));
        System.exit(0);
    }
}
