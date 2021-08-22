import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = input.nextInt();
        }
        Arrays.sort(v);
        System.out.println(v[tam / 2]);
    }
}
