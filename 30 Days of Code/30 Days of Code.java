import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int i = 0; i < testes; i++) {

            Verificador crianca = new Verificador();
            crianca.idade = input.nextInt();

            crianca.pessoa(crianca.idade);
            crianca.p1();
            crianca.p2();
            if (i < testes - 1) {

                crianca.p3();
            }
        }
        input.close();
        System.exit(0);
    }
}

class Verificador {

    int idade;

    public void pessoa(int n) {
        if (n < 0) {
            idade = 0;
            System.out.println("Age is not valid, setting age to 0");
        } else {
            idade = n;
        }

    }

    public void p1() {

        if (idade < 13 && idade >= 0) {
            System.out.println("You are young.");
        }
        if (idade >= 13 && idade < 18) {
            System.out.println("You are a teenager.");
        }
        if (idade >= 18) {

            System.out.println("You are old.");
        }
    }

    public void p2() {

        idade = idade + 3;
        if (idade < 13 && idade >= 0) {
            System.out.println("You are young.");
        }
        if (idade >= 13 && idade < 18) {
            System.out.println("You are a teenager.");
        }
        if (idade >= 18) {

            System.out.println("You are old.");
        }
    }

    public void p3() {
        System.out.println();
    }

}
