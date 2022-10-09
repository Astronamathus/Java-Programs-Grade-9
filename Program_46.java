//Program_46
/*Write a program  to input a number and print whether it is a palindrome or not*/
//13.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_46
{ 
    public static void main()
    {
        int reverse = 0;
        int digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int copy = n;
        for(;n!=0;)
        {
            digit = n % 10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        if (reverse == copy)
        {
           System.out.println(copy+" is a palindrome"); 
        }
        else
        {
            System.out.println(copy+" is not a palindrome");
        }
    }
}