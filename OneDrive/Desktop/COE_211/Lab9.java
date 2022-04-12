import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initialize array of integers
            int[] assignmentGrd = new int[5];
            int attendanceGrd;
            int midtermGrd;
            int sum = 0;
            double average;
        // for loop to get user input & store in array
        for (int i = 0; i < assignmentGrd.length; i++){
            System.out.println("Input the grade of assignment " + (1+i));
            assignmentGrd[i] = scan.nextInt();

        }
        System.out.println("Input the number of attended labs");
        attendanceGrd = scan.nextInt();
        System.out.println("Input the midterm grade");
        midtermGrd = scan.nextInt();
        // for loop to iterate over the array & perform calculations
        for (int i = 0; i < assignmentGrd.length; i++){
            sum += assignmentGrd[i];

        }
        average = sum/ (double) assignmentGrd.length;
        // display output to user
        System.out.println("Assignments (30%): " + (average*0.3)
        + "\nAttendance (5%): " + (attendanceGrd* 100*0.05/7)
         + "\nMidterm (30%): " + (midtermGrd*0.3)
        );

    }
}