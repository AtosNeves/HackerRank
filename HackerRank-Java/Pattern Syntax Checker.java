import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        String entrada;
        input.nextLine();
        for (int i = 0; i < testes; i++) {

            entrada = input.nextLine();
            try {
                Pattern.compile(entrada);
                System.out.println("Valid");

            }

            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

        }
    }
}

