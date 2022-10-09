//Program_44
/*Write a program to print the factorial of a number*/
//13.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_44
{ 
    public static void main()
    {
        int i;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            factorial = factorial*i;
        }
        System.out.println("The factorial of "+n+" is "+factorial);
    }
}

