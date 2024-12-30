/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December, 2024
 */
import java.util.Scanner;

public class Triangle {

    public void solveAreaOfTriangle() {
        double base, height, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
        System.out.println();
        System.out.print("Enter Base of the Triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter Height of the Triangle: ");
        height = sc.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area of the Triangle = " + area + " square units");
    }
}
