package labatory1.lab1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args0) {

        Scanner scanner = new Scanner(System.in);

        Data data = new Data();

        while (true) {

            System.out.print("Enter number(Q to quit): ");
            if (scanner.hasNextDouble()){

                double value = scanner.nextDouble();
                data.add(value);
            } else {

                String input = scanner.nextLine();
                if(input.equalsIgnoreCase("Q")){
                    break;
                }
            }
        }
        System.out.println("AVERAGE = " + data.getAverage());
        System.out.println("MAXIMUM = " + data.getMax());
        System.out.println(data.toString());
    }
}
