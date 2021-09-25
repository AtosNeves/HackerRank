import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int v[] = new int[50];
        int contador = 0;
        int maior = 0;
        int contagem = 0;
        int entrada = input.nextInt();
        while (entrada >= 1) {
            v[contador] = entrada % 2;
            entrada = entrada / 2;
            contador = contador + 1;

        }
        
        for (int i = 0; i < v.length; i++) {
                if (v[i]==1) {
                    contagem = contagem + 1;
                    
                
                    if (contagem > maior) {
                        maior = contagem;
                    }
                }
                if (v[i]==0) {
                    contagem = 0;
                }
                
        }
        System.out.println(maior);
        
    }

}
