//Program_26
/*Write a program to input a digit and print it in words*/
//28/7/22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_26
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int digit;
        String result;
        System.out.println("Enter a digit below:");
        digit = sc.nextInt();
        if (digit == 0)
        {
            result = "Zero";
        }
        else if (digit == 1)
        {
            result = "One";
        }
        else if (digit == 2)
        {
            result = "Two";
        }
        else if (digit == 3)
        {
            result = "Three";
        }
        else if (digit == 4)
        {
            result = "Four";
        }
        else if (digit == 5)
        {
            result = "Five";
        }
        else if (digit == 6)
        {
            result = "Six";
        }
        else if (digit == 7)
        {
            result = "Seven";
        }
        else if (digit == 8)
        {
            result = "Eight";
        }
        else if (digit == 9)
        {
            result = "Nine";
        }
        else
        {
            result = "Invalid number";
        }
        System.out.println("The number is "+ result);
    }
}