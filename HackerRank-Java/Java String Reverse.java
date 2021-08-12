import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String entrada = input.nextLine();

        String virada = new StringBuilder(entrada).reverse().toString();

        if (entrada.equals(virada)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

