
/**
 * @author Muhammad Alvyn Adhianto
 */
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukkan Total Penjualan :");
        try (Scanner input = new Scanner(System.in)) {
            int item = input.nextInt();

            double gaji = 500000;
            double bonus;
            if (item > 80) {
                bonus = item * 50000 * 0.35;
                gaji = gaji + bonus;
            } else if (item >= 40 && item <= 80) {
                bonus = item * 50000 * 0.25;
                gaji = gaji + bonus;
            } else if (item < 15)
                gaji = gaji - 0.15 * 50000 * (15 - item);
            else {
                bonus = item * 50000 * 0.1;
                gaji = gaji + bonus;
            }
            System.out.println("Total Gaji : " + gaji);
        }
    }
}
