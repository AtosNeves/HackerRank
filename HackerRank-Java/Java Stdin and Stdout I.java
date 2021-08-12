import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        input.close();
    }
}

