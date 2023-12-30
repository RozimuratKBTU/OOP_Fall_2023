package practice1;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Current Balance: ");
        double balance = scan.nextDouble();

        System.out.print("Interest rate: ");
        double interest_rate = scan.nextDouble() / 100;
//        Double new_balance = scan.nextDouble();

        Double new_balance = balance * (1 + interest_rate);

        System.out.print("New Balance: ");
        System.out.println(new_balance + " $");

    }
}
