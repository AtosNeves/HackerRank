
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[4];
        int b[] = new int[4];
        int tb = 0;
        int ta = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                ta = ta + 1;
            }
            if (a[i] < b[i]) {

                tb = tb + 1;
            }

        }
        System.out.println(ta + " " + tb);
    }
}
