import java.util.*;

import java.io.IOException;

class Solution {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(entrada + " x " + i + " = " + entrada * i);
        }

    }
}

