//Program_67
/*Write a program to input a 3-digit number and print wther it is an Armstrong number or not*/
//29.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_67
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int digit;
        int sum = 0;
        System.out.println("Enter a 3 digit number below:");
        num = sc.nextInt();
        int num_copy = num;
        while(num > 0)
        {
            digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if (sum == num_copy)
            {
                System.out.println(num_copy+" is an Armstrong number");
            }
        else
            {
                System.out.println(num_copy+" is not an Armstrong number");
            }
    }
}