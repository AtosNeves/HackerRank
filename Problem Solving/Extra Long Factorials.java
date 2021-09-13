import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        BigInteger fac = BigInteger.valueOf(1);
        // x = x - 1;
        while (x > 1) {
            fac = fac.multiply(BigInteger.valueOf(x));
            x = x - 1;
        }
        System.out.println(fac);
        System.exit(0);
        input.close();
    }

}

