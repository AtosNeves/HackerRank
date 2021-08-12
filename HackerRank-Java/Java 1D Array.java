import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int arr[];
        arr = new int[i];
        for (int j = 0; j < i; j++) {

            arr[j] = input.nextInt();

        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}

