//program to make a error handling class and show divide by zero error

import java.util.Scanner;

public class DivideByZero
{
    //constructor
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        try
        {
            int result = quotient(numerator, denominator);
            System.out.printf("%d / %d = %d%n", numerator, denominator, result);
        }
        catch (ArithmeticException arithmeticException)
        {
            System.err.printf("%nException: %s%n", arithmeticException);
            System.err.printf("Zero is an invalid denominator. Please try again.%n%n");
        }

        System.out.printf("Execution continues ...%n");
    }
}