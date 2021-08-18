import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        long entrada[] = new long[5];

        for (int i = 0; i < 5; i++) {
            entrada[i] = input.nextLong();
        }
        Arrays.sort(entrada);

        long max = 0;
        long min = 0;
        for (int i = 0; i < 4; i++) {
            min = min + entrada[i];
        }
        for (int i = 1; i <= 4; i++) {
            max = max + entrada[i];

        }

        System.out.println(min + " " + max);
    }

}

