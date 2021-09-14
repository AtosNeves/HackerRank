import java.util.*;


import java.io.IOException;

class Solution {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int entra = input.nextInt();
        TabuadaCalculo tabuadinha = new TabuadaCalculo();
        tabuadinha.resultado = entra;

        for (int i = 1; i <= 10; i++) {

            int mult = tabuadinha.retorno(tabuadinha.resultado);
            
            System.out.println(tabuadinha.resultado + " x " + i + " = " + tabuadinha.retorno(tabuadinha.resultado) * i);

        }
    }
}

class TabuadaCalculo {

    public static int resultado;

    public int retorno(int entrada) {
        resultado = entrada;
        return resultado;

    }

}

