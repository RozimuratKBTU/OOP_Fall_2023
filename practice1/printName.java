package practice1;

import java.util.Scanner;

public class printName {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        int nameLength = name.length();
        int boxLength = nameLength + 4;

        System.out.print("+");

        for (int i = 0; i < boxLength-2; i++) {
            System.out.print("-");
        }
        System.out.print("+");

        System.out.println();

        System.out.println("| " + name + " |");

        System.out.print("+");

        for (int i = 0; i < boxLength-2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
//        System.out.println();

        scan.close();
    }
}
