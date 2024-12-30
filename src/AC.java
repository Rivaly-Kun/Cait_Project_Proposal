/**
 * Programmer: Caitleen Mae Tiongco
 * Grade & Section: 10-St.Philomena
 * Date Coded: December ,2024
 */
import java.util.Scanner;
public class AC
{   
    public static void solveforAreaofCircle(){
        
    double a,r;
    System.out.println("\u000c");
    System.out.println();
    System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
    System.out.println();
    System.out.println("Enter radius : ");
    Scanner sc = new Scanner(System.in);
    r=sc.nextDouble();
    a=3.14*r*r;
    System.out.println("Area of Circle = "+ " " + a);
}
}