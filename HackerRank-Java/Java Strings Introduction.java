import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        int len = (a + b).length();
        System.out.println(len);
        String i;
        int res = a.compareTo(b);
        if (res >= 1) {
            System.out.println("Yes");
        }
        if (res <= -1) {
            System.out.println("No");
        }
        if (res == 0) {
            System.out.println("No");
        }

        String aa = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bb = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(aa + " " + bb);
        input.close();
    }
}

