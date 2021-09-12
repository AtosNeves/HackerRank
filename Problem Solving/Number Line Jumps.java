import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int v1 = input.nextInt();
        int x2 = input.nextInt();
        int v2 = input.nextInt();
        boolean res = false;
        while (x1 <= x2) {

            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x2 == x1) {
                res = true;
                break;
            }
        }
        if (res) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.exit(0);
        input.close();
    }

}

