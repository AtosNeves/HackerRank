import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = input.nextInt();
        }

        for (int i = tam - 1; i >= 0; i--) {
            System.out.print(v[i]);

            if (i > 0) {
                System.out.print(" ");
            }

        }
        System.out.println();

        input.close();
    }
}

