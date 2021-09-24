import java.io.IOException;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        System.out.println(factorial(entrada));
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {

            return n * (factorial(n - 1));
        }

    }

}
