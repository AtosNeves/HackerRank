import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Student aluno = new Student();
        aluno.firstName = input.next();
        aluno.lastName = input.next();
        aluno.idNumber = input.nextInt();

        int qNotas = input.nextInt();
        int registroNotas[] = new int[qNotas];
        for (int i = 0; i < qNotas; i++) {
            registroNotas[i] = input.nextInt();
        }

        System.out.println("Name: " + aluno.lastName + ", " + aluno.firstName);
        System.out.println("ID: " + aluno.idNumber);
        System.out.println("Grade: " + aluno.SudentScore(qNotas, registroNotas));
    }

}

/**
 * {@link Main}
 */
class Student {
    String firstName;
    String lastName;
    int idNumber;
    Double score;

    public static char SudentScore(int q, int[] notas) {
        int soma = 0;
        for (int i = 0; i < q; i++) {
            soma = soma + notas[i];
        }
        float m = soma / q;
        int tests[] = { 100, 90, 80, 70, 55, 40 };

        if (tests[1] <= m && m <= tests[0]) {

            return 'O';

        }
        if (tests[2] <= m && m < tests[1]) {

            return 'E';

        }
        if (tests[3] <= m && m < tests[2]) {

            return 'A';

        }
        if (tests[4] <= m && m < tests[3]) {

            return 'P';

        }
        if (tests[5] <= m && m < tests[4]) {

            return 'D';

        } else {
            return 'T';
        }

    }

}
