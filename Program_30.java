//Program_30
/*Write a program to input a 3-digit number and print wther it is an Armstrong number or not*/
//1.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_30
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int digit;
        int sum = 0;
        String result;
        System.out.println("Enter a 3 digit number below:");
        num = sc.nextInt();
        int num_copy = num;
        if (num < 1000 && num >= 100)
        {
            digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num/10;
            digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num/10;
            digit = num % 10;
            sum = sum + (digit*digit*digit);
            if (sum == num_copy)
            {
                System.out.println(num_copy+" is an Armstrong number");
            }
            else
            {
                System.out.println(num_copy+" is not an Armstrong number");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}