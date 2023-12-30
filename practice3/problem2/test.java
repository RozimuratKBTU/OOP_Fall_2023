package practice3.problem2;

import java.util.Scanner;
import java.util.Vector;
public class test {
    String name;
    int age;
    public test(String name, int test) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Vector <Person> people = new Vector<Person>();
		while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Person");
            System.out.println("2. Add Staff");
            System.out.println("3. Add Student");
            System.out.println("4. Exit");
            System.out.println("5. Print all  people");
            int choice = input.nextInt();
            input.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    people.add(new Person(name, address));
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = input.nextLine();
                    System.out.print("Enter address: ");
                    address = input.nextLine();
                    System.out.print("Enter school: ");
                    String school = input.nextLine();
                    System.out.print("Enter pay: ");
                    double pay = input.nextDouble();
                    people.add(new Staff(name, address, school, pay));
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = input.nextLine();
                    System.out.print("Enter address: ");
                    address = input.nextLine();
                    System.out.print("Enter program: ");
                    String program = input.nextLine();
                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    System.out.print("Enter fee: ");
                    double fee = input.nextDouble();
                    people.add(new Student(name, address, program, year, fee));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                case 5:
                	System.out.println(people);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
//        test s = new test("111", 1);
//        test s2 = new test("111", 1);

//        System.out.println(s==s2);
    }

}