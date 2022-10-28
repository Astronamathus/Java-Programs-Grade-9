//Program_82
/*Write a program to input a number and print the product of its digits excluding 0*/
//29.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_82
{ 
    public static void main()
    {
        int n;
        int product = 1;
        int digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        n = sc.nextInt();
        int copy = n;
        do
        {
            digit = n % 10;
            if (digit == 0)
            {
                digit = 1;
            }
            n = n/10;
            product = product*digit;

        }
        while(n!=0);
        System.out.println(product+" is the product of the digits of "+copy);
    }
}