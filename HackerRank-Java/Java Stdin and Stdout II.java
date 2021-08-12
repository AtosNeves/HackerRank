import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n1;
        Double n2;
        String n3;
        n1 = input.nextInt();
        n2 = input.nextDouble();
        input.nextLine();
        n3 = input.nextLine();

        System.out.println("String: " + n3);
        System.out.println("Double: " + n2);
        System.out.println("Int: " + n1);
        input.close();
    }
}

