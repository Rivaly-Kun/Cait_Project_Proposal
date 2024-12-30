/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December, 2024
 */
import java.util.Scanner;

public class CRAT {

    public void solveChemicalReactionRate() {
        double time, concentration, reactionRate;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
        System.out.println();
        System.out.print("Enter Time (in seconds): ");
        time = sc.nextDouble();
        System.out.print("Enter Change in Concentration (mol/L): ");
        concentration = sc.nextDouble();
        reactionRate = time / concentration;
        System.out.println("Reaction Rate = " + reactionRate + " mol/(L·s)");
    }
}
