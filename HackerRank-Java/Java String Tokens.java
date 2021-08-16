import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int l = a.length();

        Boolean v;
        int contador = 0;
        for (int i = 1; i < l; i++) {

            if (Character.isLetter(a.charAt(i - 1)) == false && Character.isLetter(a.charAt(i)) == false) {
                contador = contador - 1;
            }
            if (Character.isLetter(a.charAt(i)) == false) {
                contador = contador + 1;
            }

        }
        if (Character.isLetter(a.charAt(l - 1))) {
            contador = contador + 1;
        }
        System.out.println(contador);
        for (int i = 1; i < l; i++) {
            v = Character.isLetter(a.charAt(i - 1));
            if (Character.isLetter(a.charAt(i - 1)) == false && Character.isLetter(a.charAt(i)) == false) {
                i = i + 1;
            }
            if (v) {
                System.out.print(a.charAt(i - 1));
            }
            if (Character.isLetter(a.charAt(i - 1)) == true && Character.isLetter(a.charAt(i)) == false) {
                if (i == l - 1) {
                    break;
                } else {
                    System.out.println();
                }
            }
            if (i == l) {
                break;
            }

        }
        if (Character.isLetter(a.charAt(l - 1))) {
            System.out.println(a.charAt(l - 1));
        }

        input.close();
    }
}

