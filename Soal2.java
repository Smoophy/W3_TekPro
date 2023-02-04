
/**
 * @author Muhammad Alvyn Adhianto
 */
import java.util.Scanner;

public class Soal2 {
public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String[] input = new String[3];

            for (int i=0; i<3; i++){
                input[i]= sc.nextLine();
            }
            System.out.println("=======================");
            for (int i=0; i<3; i++){
                String[] parts = input[i].split(" ");
                String firstpart = parts[0].toLowerCase();
                int secondPart = Integer.parseInt(parts[1]);

                System.out.printf("%-15s %03d\n", firstpart, secondPart);

            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("=======================");
    }
}