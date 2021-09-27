import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int testes = input.nextInt();
        for (int i = 0; i < testes; i++) {

            String entrada = input.next();
            Calculator calculadora = new Calculator();
            System.out.println(calculadora.power(entrada));
        }
    }
}

class Calculator {

    int n1;
    int n2;
    static int res;

    public static String power(String entrada) {

        int v = 0;
        for (int i = 0; i < entrada.length(); i++) {

            if (entrada.charAt(i) == ' ') {
                v = i;

            }

        }
        if (v != 0) {

            //System.out.println(v);

            String n1 = entrada.substring(0, v);
            String n2 = entrada.substring(v + 1, entrada.length());

            int number1 = Integer.parseInt(n1);
            int number2 = Integer.parseInt(n2);

            if (number1 >= 0 && number2 >= 0) {

                res = (int) Math.pow(number1, number2);
                String resultado = String.valueOf(res);
                return resultado;
            } else {
                return "n and p should be non-negative";

            }

        }
        return entrada;
    }
}
