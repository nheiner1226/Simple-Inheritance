// Import Scanner class
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    // Main class
    public static void main(String args[]) {

        // Create scanner object
        Scanner aScan = new Scanner(System.in);


        // Create subclass objects
        Babbel b1 = new Babbel("Babbel", "Orange", "B");
        Drops dr1 = new Drops(2022, 1000, 1);
        Duolingo du1 = new Duolingo();
        RosettaStone rs1 = new RosettaStone();


        // Ask user to input a number corresponding to an app in list
        System.out.println("Please enter corresponding to the an application: " + '\n'
                + "1 - Babbel, 2 - Drops, 3 - Duolingo, 4 - Rosetta Stone.");


        // Assign input to an int variable
        int input = aScan.nextInt();


        while(input < 1 || input > 4) {

            // Ask for user input
            System.out.println("Please enter a variable between 1 and 4.");


            // Assign input to an int variable
            input = aScan.nextInt();

        }


        // Exception Handling
        // Input passed to try block
        try  {

            // Create switch-case
            // Call genInfo method in each case

            // Switch expression
            switch (input) {

                case 1:
                    b1.genInfo();
                    break;

                case 2:
                    dr1.genInfo();
                    break;

                case 3:
                    du1.genInfo();
                    break;

                case 4:
                    rs1.genInfo();
                    break;


                // If no matches, execute this code
                default:
                    System.out.println("This error shouldn't display.");
            }

        }


        // If the following exception occurs, the code in the body will execute
        catch (InputMismatchException ex)  {
            System.out.println("You must enter an integer.");
        }

    }

}
