
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        long entrada = 0;
        long soma = 0;
        for (int i = 0; i < testes; i++) {
            entrada = input.nextLong();
            soma = soma + entrada;
        }

        System.out.println(soma);
    }
}
