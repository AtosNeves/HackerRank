import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        if (a > 0 && b > 0) {
            System.out.println(a * b);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}

