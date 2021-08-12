import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int g = n1 * i;
            System.out.println(n1 + " x " + i + " = " + g);

        }
    }
}

