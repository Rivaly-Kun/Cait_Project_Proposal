/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December, 2024
 */
import java.util.Scanner;

public class Force {
    public void solveForForce() {
        double mass, acceleration, force;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
        System.out.println();
        System.out.print("Enter Mass (in kg): ");
        mass = sc.nextDouble();
        System.out.print("Enter Acceleration (in m/s²): ");
        acceleration = sc.nextDouble();
        force = mass * acceleration;
        System.out.println("Force = " + force + " N");
    }
}
