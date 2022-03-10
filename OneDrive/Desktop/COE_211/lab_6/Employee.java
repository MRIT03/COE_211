import java.util.Scanner;

public class Employee { //fun fact dogs are cute
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

        /**
         * Continue code here to ask for the first name, last name, age, and salary, IN THAT ORDER
         */
        System.out.println("Please input the employee's first name:");
        firstName = scan.nextLine();
        System.out.println("Please input the employee's last name:");
        lastName = scan.nextLine();
        System.out.println("Please input the employee's age:");
        age = scan.nextInt();
        System.out.println("Please input the employee's salary:");
        salary = scan.nextDouble();

    }

    public String toString() {
        return "employee information: " + firstName + ", "  + lastName + ", " + age + ", " + salary;
    }
}