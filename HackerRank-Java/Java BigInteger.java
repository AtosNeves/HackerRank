import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BigInteger entrada1 = input.nextBigInteger();
        BigInteger entrada2 = input.nextBigInteger();

        BigInteger soma = entrada1.add(entrada2);
        BigInteger mult = entrada1.multiply(entrada2);
        System.out.println(soma);
        System.out.println(mult);
        input.close();
    }
}

