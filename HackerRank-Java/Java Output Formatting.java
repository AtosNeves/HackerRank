import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        String s1;
        int s2;
        for (int i = 0; i < 3; i++) {
            s1 = input.next();
            s2 = input.nextInt();
            System.out.printf("%-15s%03d%n", s1, s2);

        }
        System.out.println("================================");
    }
}

