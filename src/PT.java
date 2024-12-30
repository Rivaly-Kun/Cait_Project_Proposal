/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December, 2024
 */
import java.util.Scanner;

public class PT {
    public static void main(String[] args) {
        myMenu();
    }

    public static void myMenu() {
        Scanner HT = new Scanner(System.in);
        int choice;
        System.out.println("╔.★. .═══════════════════════════╗");
        System.out.println();
        System.out.println("    S E L E C T   O P E R A T I O N ");
        System.out.println();
        System.out.println("╚═══════════════════════════. .★.╝");
        System.out.println();
        System.out.println("  1 --> Solve for Area of the Circle");
        System.out.println("  2 --> Solve for Chemical Reaction Rate");
        System.out.println("  3 --> Solve for Distance");
        System.out.println("  4 --> Solve for Area of a Triangle");
        System.out.println("  5 --> Solve for Volume of a Cylinder");
        System.out.println("  6 --> Solve for Force");
        System.out.println("  7 --> Exit");
        System.out.println();
        System.out.println(" ✄┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
        System.out.println();
        System.out.print("Enter Choice: ");
        choice = HT.nextInt();

        switch (choice) {
            case 1:
                AC circle = new AC();
                circle.solveforAreaofCircle();
                break;
            case 2:
                CRAT reaction = new CRAT();
                reaction.solveChemicalReactionRate();
                break;
            case 3:
                FT distance = new FT();
                distance.solveForDistance();
                break;
            case 4:
                Triangle triangle = new Triangle();
                triangle.solveAreaOfTriangle();
                break;
            case 5:
                VolumeCylinder cylinder = new VolumeCylinder();
                cylinder.solveVolumeOfCylinder();
                break;
            case 6:
                Force force = new Force();
                force.solveForForce();
                break;
            case 7:
                System.out.println("Thank you for using my Java PT! ୨ৎ  ‪♡ ");
                return;
            default:
                System.out.println("Invalid choice.");
        }

        retry();
    }

    public static void retry() {
        Scanner HT = new Scanner(System.in);
        String ans;
        System.out.print("Do you want to continue? [y/n]: ");
        ans = HT.nextLine();
        System.out.println();
        if (ans.equalsIgnoreCase("y")) {
            myMenu();
        } else {
            System.out.println("Thank you for using my Java PT! ୨ৎ  ‪♡ ");
        }
    }
}
