import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Student {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int testes = input.nextInt();
        int total = 0;
        int aux = 0;
        int array[] = new int[testes];
        int contador = 0;
        String entrada = input.next();
        String arr[] = entrada.split(" ");
        for (int i = 0; i < testes; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        
        for (int i = 0; i < testes; i++) {
            for (int j = 0; j < testes - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = aux;
                    total = total + 1;
                }
            }
        }
    System.out.println("Array is sorte in "+total+" swaps.");
    System.out.println("First Element: "+array[0]);
    System.out.println("Last Element: " + array[testes-1]);
    }

}

