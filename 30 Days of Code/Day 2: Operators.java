import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double price = input.nextDouble();
        double tip_p = input.nextDouble();
        double tax_p = input.nextDouble();

        double tip = tip(price, tip_p);
        double tax = tax(price, tax_p);
        System.out.println(Math.round(tip + tax+price));
        System.exit(0);
        input.close();
    }

    private static double tip(double price, Double tip) {

        double t = price * tip / 100;

        return t;
    }

    private static double tax(double price, Double tip) {

        double t = price * tip / 100;

        return t;
    }
}

