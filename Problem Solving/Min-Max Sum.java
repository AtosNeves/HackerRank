import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long[] v = new long[5];
        for (int i = 0; i < 5; i++) {
            v[i] = input.nextLong();

        }
        Arrays.sort(v);

        long smax = 0;
        long smin = 0;
        for (int i = 1; i <= 4; i++) {
            smax = smax + v[i];
        }
        for (int i = 0; i <= 3; i++) {
            smin = smin + v[i];
        }
        System.out.println(smin + " " + smax);
        input.close();
        System.exit(0);
    }
}
