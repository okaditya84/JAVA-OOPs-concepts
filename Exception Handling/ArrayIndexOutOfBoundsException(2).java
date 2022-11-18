//program to display ArrayIndexOutOfBoundsException with try and catch blocks in biniary search

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int i, num, first, last, middle;
        System.out.println("Enter 5 numbers in ascending order: ");
        for (i = 0; i < 5; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter number to search: ");
        num = input.nextInt();
        first = 0;
        last = 4;
        middle = (first + last) / 2;
        try
        {
            while (first <= last)
            {
                if (arr[middle] < num)
                {
                    first = middle + 1;
                }
                else if (arr[middle] == num)
                {
                    System.out.println(num + " found at location " + (middle + 1) + ".");
                    break;
                }
                else
                {
                    last = middle - 1;
                }
                middle = (first + last) / 2;
            }
            if (first > last)
            {
                System.out.println(num + " is not present in the list.");
            }
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("ArrayIndexOutOfBoundsException: " + a.getMessage());
        }
    }
}