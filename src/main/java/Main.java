import java.util.Scanner;

public class Main {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt the user for a string
        // read the string as an int
        // get another int the same way
        // add print the numbers

        String prompt = "Enter an integer";
        int firstNumber = getIntFromUser(prompt);

        System.out.println("first number: " + firstNumber);

    }

    private static int getIntFromUser(String prompt) {
        int firstNumber;
        System.out.println(prompt);
        String input = myScanner.nextLine();
        firstNumber = Integer.parseInt(input);
        return  firstNumber;
    }
}
