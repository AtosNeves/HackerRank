import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String hacker = "HackerRank ";
        int ii = input.nextInt();
        System.out.println(i + ii);

        double dd = input.nextDouble();
        System.out.printf("%.1f\n", d + dd);
        input.nextLine();
        String entrada = input.nextLine();
        System.out.println(hacker.concat(entrada));
        input.close();
        System.exit(0);

    }

}
