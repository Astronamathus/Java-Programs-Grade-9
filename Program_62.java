//Program_62
/*Write a program to input a number and print the number in reverse order*/
//25.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_62
{ 
    public static void main()
    {
        int reverse = 0;
        int digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int copy = n;
        while(n!=0)
        {
            digit = n % 10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        System.out.println("The reverse of "+copy+" is "+reverse);
    }
}

