import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        String s;
        while (input.hasNext()) {

            s = input.nextLine();

            contador = contador + 1;
            System.out.println(contador + " " + s);
        }

    }
}

