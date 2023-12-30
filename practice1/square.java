package practice1;

import java.util.Scanner;

public class square {
    public static void main(String[] args){

        Scanner scan = new  Scanner(System.in);
        double a = scan.nextDouble();
//        int b = scan.nextInt();

        Double area = Math.pow(a, 2);
        Double Peremetr = 4*a;
        Double Diagonal = a * Math.sqrt(2);


    }
}
