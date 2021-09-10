/* create a menu that prints a welcome message like this so
Counter Program. Please choose an action:
1. Count Up
2. Count Down

User should be able to select either 1 or 2, and quit to exit program.
Also user should be able to input start and stop value to be counted
If either is selected call the corresponding method

create hhe method for counting down from a start number to a finish number, nn your counter class
and call that method if 2 is selected
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main ();
        Scanner scanner = new Scanner(System.in);
        main.chooseAction();
    }

    void chooseAction() {
        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();
        String userInput = "";
        do {
            System.out.println("Please choose an action:");
            System.out.println("1 - Count Down");
            System.out.println("2 - Count Up ");
            System.out.println("Exit - Exit");
            System.out.println("Choose a number:");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "Exit":
                    System.out.println("End");
                    break;
                case "2":
                    System.out.println("Please insert two numbers to row descending");
                    int i1 = scanner.nextInt();
                    int i2 = scanner.nextInt();;
                    counter.countTo(i1,i2);
                    break;
                case "1":
                    System.out.println("Please insert two numbers to row ascending");
                    int i3 = scanner.nextInt();
                    int i4 = scanner.nextInt();
                    counter.countDown(i3,i4);
                    break;
            }
            return;
        }while (!userInput.equalsIgnoreCase("End"));
    }
}
