package practice1;

import java.util.Scanner;

public class score {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();

        if (95 <= score && score <= 100 ){
            System.out.println("A+");
        }
        if (94 >= score && score >= 90 ){
            System.out.println("A");
        }
        if (85 <= score && score <= 89 ){
            System.out.println("B+");
        }
    }
}
