import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // int testes = input.nextInt();
        String entrada;
        while (input.hasNext()) {

            entrada = input.nextLine();

            boolean res = Pattern.matches(
                    "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])[.]([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])[.]([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])[.]([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])",
                    entrada);
            if (res) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

