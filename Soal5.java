
/**
 * @author Muhammad Alvyn Adhianto
 */

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int mobil1 = input.nextInt();
            int mobil2 = input.nextInt();
            int mobil3 = input.nextInt();
            int mobil4 = input.nextInt();

            if ((mobil1 + mobil2 + mobil3 + mobil4) % 5 == 0) {
                System.out.println("jalan");
            } else {
                System.out.println("berhenti");
            }
        }
    }
}
