//Program_68
/*Write a program to input a number and print the sum of the even and odd digits*/
//30.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_68
{ 
    public static void main()
    {
        int n;
        int digit;
        int sum_even = 0;
        int sum_odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        n = sc.nextInt();
        while(n!=0)
        {
            digit = n % 10;
            if (digit % 2 == 0)
            {
                sum_even = sum_even + digit;
            }
            else
            {
                sum_odd = sum_odd + digit;
            }
            n = n/10;
        }
        System.out.println("Odd numbers sum: "+sum_odd);
        System.out.println("Even numbers sum: "+sum_even);
    }
}