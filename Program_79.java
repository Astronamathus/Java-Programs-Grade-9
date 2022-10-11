//Program_79
/*Write a program to print the factorial of a number*/
//11.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_79
{ 
    public static void main()
    {
        int i = 1;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        do
        {
            factorial = factorial*i;
            i++;
        }
        while(i<=n);
        System.out.println("The factorial of "+n+" is "+factorial);
    }
}

