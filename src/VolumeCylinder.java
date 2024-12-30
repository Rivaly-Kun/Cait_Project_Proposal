/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December, 2024
 */
import java.util.Scanner;

public class VolumeCylinder {
    public void solveVolumeOfCylinder() {
        double radius, height, volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
        System.out.println();
        System.out.print("Enter Radius of Cylinder (in cm): ");
        radius = sc.nextDouble();
        System.out.print("Enter Height of Cylinder (in cm): ");
        height = sc.nextDouble();
        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("Volume of Cylinder = %.2f cm³%n", volume);
    }
}
