/*
 * Write a Java program that reads two numbers from the console. 
 * Add two numbers and print the output on the console. 
 * Use java.io.Console Class to read lines from the console. 
 * Convert the Strings to numbers before carrying out the mathematical operations. 
 * (Run the program in command prompt only.)
 */
import java.io.Console;
public class NewConsole{
    public static void main(String[] args) 
    {
        Console consoleObj = System.console();//Create Console Object
        
        if (consoleObj == null) //For Checking Console  
        {
            System.err.println("No console.");
            System.exit(1);
        }

        String num1Str = consoleObj.readLine("Enter the first number: ");
        String num2Str = consoleObj.readLine("Enter the second number: ");

        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            double sum = num1 + num2;

            consoleObj.printf("The sum of %.2f and %.2f is: %.2f%n", num1, num2, sum);
        }
        catch (NumberFormatException e) 
        {
            consoleObj.printf("Invalid input. Please enter valid numbers");
        }
    }
}

