
/**
 * @author Muhammad Alvyn Adhianto
 */
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukkan teks: ");
        try (Scanner input = new Scanner(System.in)) {
            String s = input.nextLine();
            String[] arrOfStr = s.split("\\W+");

            System.out.println(arrOfStr.length);

            for (String a : arrOfStr)
                System.out.println(a);
        }
    }
}