import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String h = input.nextLine();

        String sub = h.substring(0, 8);
        // System.out.println(sub);
        String minuto = h.substring(3, 5);
        String segundos = h.substring(6, 8);
        String hora = h.substring(0, 2);
        int horaint = Integer.parseInt(hora);
        String[] horario = sub.split(":");
        String turno = h.substring(8, 10);
        // System.out.println(turno);

        // System.out.println(horario[0]);

        if (turno.equals("PM") && horaint < 12) {
            System.out.println(horaint + 12 + ":" + minuto + ":" + segundos);
        } else if (turno.equals("PM") && horaint >= 12) {
            System.out.println(horaint + ":" + minuto + ":" + segundos);
        }

        else if (turno.equals("AM") && horaint >= 12) {
            System.out.println("0" + (horaint - 12) + ":" + minuto + ":" + segundos);
        } else if (turno.equals("AM") && horaint < 12) {
            System.out.println("0" + (horaint) + ":" + minuto + ":" + segundos);
        }

        else {
            System.out.println(horaint + ":" + minuto + ":" + segundos);
        }

    }

}

