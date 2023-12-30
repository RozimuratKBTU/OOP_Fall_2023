package practice1;

import java.util.Scanner;

public class Back {
    public static void main(String[] args){
        boolean is_Polindrome = true;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        String name = scan.nextLine();

        name = name.toLowerCase();



        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length()-i-1)){
                is_Polindrome = false;
                break;
            }
        }

        if(is_Polindrome)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
