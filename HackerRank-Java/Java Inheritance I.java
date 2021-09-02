import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        input.close();
        System.exit(0);
    }

}

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}
