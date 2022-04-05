import java.io.*;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
    Scanner bashScanner = new Scanner(System.in);
    FileWriter fw = new FileWriter(new File("expenses.txt"));
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter outToFile = new PrintWriter(bw);
    String yORn = "";
    String name = "";
    String purchases = "";
    double painToTheWallet;

    // Start gathering information inside the loop you will start
    do{
      System.out.println("Input your name: ");
      name = bashScanner.nextLine();
      System.out.println("What did you purchase?");
      purchases = bashScanner.nextLine();
      System.out.println("How much did you pay? (in USD)");
      painToTheWallet = bashScanner.nextDouble();
      bashScanner.nextLine();

      outToFile.append(""+ name + " purchased " + purchases + " for " + painToTheWallet + " US Dollars. \n");


      System.out.println("Would you like to log another purchase? (y/n)");
      yORn = bashScanner.nextLine();
    }while (yORn.equals("y"));

	Scanner fileScanner = new Scanner(new File("C:\Users\riado\OneDrive\Desktop\expenses.txt"));

    if (yORn.equals("n")){
      System.out.println("Get off of ZoodMall");
      System.out.println("Would you like to read a summary of your purchases?");
      yORn = bashScanner.nextLine();
      if(yORn.equals("y")){
        while(fileScanner.hasNext()){
          String line = fileScanner.nextLine();
          System.out.println(line);
        }

      }
    }
      // Close ClassWriter & Scanner objects
    outToFile.close();
    fileScanner.close();

        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}
