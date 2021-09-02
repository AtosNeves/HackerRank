import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        // String entrada="";
        input.nextLine();
        for (int i = 0; i < testes; i++) {
            String entrada = input.nextLine();
            boolean res = Pattern.matches("^[a-zA-Z][\\w]{7,29}$", entrada);
            int len = entrada.length();
            if (len > 30 || len < 8) {
                res = false;
            }
            if (res) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
        input.close();
        System.exit(0);
    }
}

