import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo;
        int oneToFour;
        do {
            System.out.println("Which service would you like to use?\n" +
                    "[1]: Basic week visualizer\n" +
                    "[2]: Advanced week visualizer\n" +
                    "[3]: Basic calculator\n" +
                    "[4]: Employee repertoire\n");
            oneToFour = scan.nextInt();
            scan.nextLine();
            if (oneToFour <=4 && oneToFour>=1){
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
                }

            }
            else {
                System.out.println("Please make sure you pick a number between 1 and 4");
            }
            System.out.println("Would you like to perform another operation? (y/n)");
            yesOrNo = scan.nextLine();
        }
        while (yesOrNo == "y");
    }
}