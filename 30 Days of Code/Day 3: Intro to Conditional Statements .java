import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        if (entrada % 2 == 1) {
            System.out.println("Weird");
        } else {

            if (entrada % 2 == 0 && entrada >= 2 && entrada <= 5) {
                System.out.println("Not Weird");
            }
            if (entrada % 2 == 0 && entrada >= 6 && entrada <= 20) {
                System.out.println("Weird");
            }
            if (entrada % 2 == 0 && entrada > 20) {
                System.out.println("Not Weird");
            }

        }

        System.exit(0);
        input.close();
    }

}

