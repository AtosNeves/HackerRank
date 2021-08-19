import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int soma = 0;
        int soma2 = 0;
        int m[][] = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                m[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    soma = soma + m[i][j];
                }
            }
        }

        int c = 0;
        for (int i = tam - 1; i >= 0; i--) {

            soma2 = soma2 + m[i][c];

            c = c + 1;
        }

        System.out.println(Math.abs(soma - soma2));

        input.close();

    }

}

