import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int veri;
        boolean verificador = false;

        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = input.nextInt();

        }

        for (int i = 0; i < tam; i++) {
            veri = v[i];
            verificador = false;
            for (int j = 0; j < tam; j++) {

                if (v[j] == veri && i != j) {
                    verificador = true;
                }
            }
            if (verificador == false) {
                System.out.println(veri);
                break;
            }
        }

    }

}

