import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        String nn1 = String.format("%d", n1);

        if (n1 >= -100 && n1 <= 100) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

    }
}

