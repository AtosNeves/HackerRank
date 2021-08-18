import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int entrada[] = new int[tam];

        for (int i = 0; i < tam; i++) {
            entrada[i] = input.nextInt();
        }
        float q0 = 0, qp = 0, qn = 0;
        for (int i = 0; i < tam; i++) {
            if (entrada[i] > 0) {
                qp = qp + 1;
            }
            if (entrada[i] < 0) {
                qn = qn + 1;
            }
            if (entrada[i] == 0) {
                q0 = q0 + 1;
            }

        }

        System.out.printf("%.6f\n", qp / tam);
        System.out.printf("%.6f\n", qn / tam);
        System.out.printf("%.6f\n", q0 / tam);

    }

}

