//Program_51
/*Write a program to input a 3-digit number and print wther it is an Armstrong number or not*/
//18.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_51
{
    public static void main()
    {
        int n, sum_even = 0, sum_odd = 0, digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        n = sc.nextInt();
        for(;n!=0;)
        {
            digit = n % 10;
            if(digit%2==0)
            {
                sum_even += digit;
            }
            else
            {
                sum_odd += digit;
            }
            n /= 10;
        }
        System.out.println("The sum of even digits is: "+sum_even);
        System.out.println("The sum of odd digits is: "+sum_odd);
    }
}