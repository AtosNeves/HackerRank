import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Student {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int entrada = 0;
        int testes = 0;
        String arr[] = new String[1000];
        int contador = 0;
        while (input.hasNext()) {
            testes = input.nextInt();
            for (int i = 0; i < testes; i++) {
                arr[i] = input.next();
                
            }
            for (int i = 0; i < testes; i++) {
                System.out.println(arr[i]);
            }

        }
    }

}

