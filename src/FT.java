/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December, 2024
 */
import java.util.Scanner;

public class FT {
    public static void solveForDistance() {
        double speed, time, distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
        System.out.println();
        System.out.print("Enter Speed (in km/h): ");
        speed = sc.nextDouble();
        System.out.print("Enter Time (in hours): ");
        time = sc.nextDouble();
        distance = speed * time;
        System.out.println("Distance = " + distance + " kilometers");
    }
}
