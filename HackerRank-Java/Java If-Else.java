import java.io.IOException;
import java.util.Scanner;

import jdk.nashorn.internal.ir.IfNode;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n1;
        n1 = input.nextInt();

        if (n1 % 2 == 1) {
            System.out.println("Weird");

        } else {
            if (n1 >= 2 && n1 <= 5) {
                System.out.println("Not Weird");
            }
            if (n1 >= 6 && n1 <= 20) {
                System.out.println("Weird");
            }
            if (n1 > 20) {
                System.out.println("Not Weird");
            }
        }
        input.close();
    }
}

