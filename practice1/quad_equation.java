package practice1;

import java.util.Scanner;

public class quad_equation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scan.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scan.nextDouble();

        double D = Math.pow(b,2) - 4 * a * c;

        if(D > 0){
            double r1 = (-b + Math.pow(D, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(D, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (D == 0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else {
            System.out.println("Roots are undefined");
        }
    }
}
