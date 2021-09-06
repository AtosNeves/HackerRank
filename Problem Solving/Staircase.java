import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int d = testes - 1;
        for (int i = 0; i < testes; i++) {
            for (int j = 0; j < testes; j++) {
                if (j < d) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }

            }
            d = d - 1;
            System.out.println();
        }
        input.close();
        System.exit(0);
    }
}
