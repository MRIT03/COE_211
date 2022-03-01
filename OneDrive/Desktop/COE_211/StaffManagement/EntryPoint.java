import java.util.Scanner;
import java.util.Random;

public class EntryPoint{
	public static void main(String[] args){
		
		// variables 		

		String firstName, lastName;
		int age;
		double salary;
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int insertions = rnd.nextInt(10) +1;
		Employee[] employee = new Employee[insertions];


		// System.out moment 
		System.out.println("You have " + insertions + " insertions left.");

		// for loop time 

		for (int i = 0; i < insertions; i++){

			// Scanner moment 
	
			System.out.println("Please input the employee's first name:");
			firstName = scan.nextLine();

			System.out.println("Please input the employee's last name:");
			lastName = scan.nextLine();

			System.out.println("Please input the employee's age:");
			age = scan.nextInt();


			System.out.println("Please input the employee's monthly salary:");
			salary = scan.nextDouble();

			scan.nextLine();

			// Final answer 

			employee[i] = new Employee(firstName, lastName, age, salary);
		
			
			System.out.println("You have " + (insertions - (i +1)) + " insertions left.");
			}

		for (int j = 0; j< insertions; j++){
			System.out.println("Employee information: " + employee[j].firstName + " " + employee[j].lastName + ", " + employee[j].age + ", " + employee[j].salary );	
		}
	}
}