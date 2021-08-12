import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String entrada;

        int inicio, fim;
        entrada = input.next();
        inicio = input.nextInt();
        fim = input.nextInt();
        System.out.println(entrada.substring(inicio, fim));

    }
}

