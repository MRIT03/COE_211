import java.util.Scanner;

public class EntryPoint {// fun fact not all of those were facts!
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo;
        int oneToFour;
        do {
            do {
                System.out.println("Which service would you like to use?\n" +
                        "[1]: Basic week visualizer\n" +
                        "[2]: Advanced week visualizer\n" +
                        "[3]: Basic calculator\n" +
                        "[4]: Employee repertoire\n");
                oneToFour = scan.nextInt();
                scan.nextLine();
                if (oneToFour >4 || oneToFour<1){
                    System.out.println("Please make sure you pick a number between 1 and 4"); //This code sucks but it works and idc about optimizing it
                }
            }
            while (oneToFour >4 || oneToFour<1);
                switch (oneToFour){
                    case 1:
                        BasicWeek.printDays();
                        break;
                    case 2:
                        AdvancedWeek.printDays();
                        break;
                    case 3:
                        Calculator calculator = new Calculator();
                        break;
                    case 4:
                        Employee employee = new Employee();

                        System.out.println(employee);
                        break;

            }

            System.out.println("Would you like to perform another operation? (y/n)");
            yesOrNo = scan.nextLine();
        }
        while (yesOrNo.equalsIgnoreCase("y"));
    }
}

//heyy Chris if you're going to use my code again please omit any embarrassing comments