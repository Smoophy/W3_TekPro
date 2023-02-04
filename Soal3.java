
/**
 * @author Muhammad Alvyn Adhianto
 */
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input;
        int value = 0;

        input = read.nextLine();

        String[] part = input.split(" ");

        int value1 = Integer.parseInt(part[0]);
        int value2 = Integer.parseInt(part[2]);
        switch (part[1]) {
            case ("+") -> value = value2 + value1;
            case ("-") -> value = value1 - value2;
            case ("*") -> value = value1 * value2;
            case ("/") -> value = value1 / value2;
            case ("%") -> value = value1 % value2;
        }
        System.out.println(value);
    }
}