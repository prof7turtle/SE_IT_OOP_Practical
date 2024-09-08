//Problem Statement
/*
Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters
two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
are not integers, the program would throw a Number Format Exception. If Num2 were zero, the
program would throw an Arithmetic Exception. Display the exception.
*/



import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first number (Num1): ");
            String num1Str = scanner.nextLine();
            System.out.print("Enter the second number (Num2): ");
            String num2Str = scanner.nextLine();

            
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            // Perform division and handle arithmetic exception if Num2 is zero
            int result = divide(num1, num2);
            System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);

        } catch (NumberFormatException e) {
           
            System.out.println("Error: Input is not a valid integer.");
            System.out.println("Exception details: " + e.getMessage());

        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception details: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error: Array index is out of bounds.");
            System.out.println("Exception details: " + e.getMessage());

        } finally {
           
            scanner.close();
        }
    }

   
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}

//===============================================================================
//Output
/*
Example 1: NoException
Enter the first number (Num1): 10
Enter the second number (Num2): 2
Output:
The result of dividing 10 by 2 is: 5

Example 2: Division by Zero
Enter the first number (Num1): 10
Enter the second number (Num2): 0
Output:
Error: Division by zero is not allowed.
Exception details: Cannot divide by zero.

Example 3: Invalid Integer Input
Enter the first number (Num1): ten
Enter the second number (Num2): 2
Output:
Error: Input is not a valid integer.
Exception details: For input string: "ten"

Example 4: Both Inputs Invalid
Enter the first number (Num1): ten
Enter the second number (Num2): zero
Output:
Error: Input is not a valid integer.
Exception details: For input string: "ten"
//===============================================================================
*/

