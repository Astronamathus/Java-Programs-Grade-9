//Program_61
/*Write a program to print the factorial of a number*/
//25.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_61
{ 
    public static void main()
    {
        int i = 1;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while(i<=n)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("The factorial of "+n+" is "+factorial);
    }
}

