import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int v[];
        int soma = 0;
        int entrada = 0;
        v = new int[tam];
        for (int i = 0; i < tam; i++) {
            entrada = input.nextInt();
            soma = soma + entrada;
        }

        System.out.println(soma);

    }

}

