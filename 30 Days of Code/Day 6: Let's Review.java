import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int j = 0; j <= testes; j++) {

            String nome = input.nextLine();
            for (int i = 0; i < nome.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(nome.charAt(i));
                }
                if (i == nome.length() - 1) {
                    System.out.print("  ");
                }
            }

            for (int i = 0; i < nome.length(); i++) {
                if (i % 2 == 1) {
                    System.out.print(nome.charAt(i));
                }
                if (i == nome.length() - 1) {
                    System.out.println();
                }
            }
        }

        input.close();
    }
}

