//Program_47
/*Write a program to input a number and print whether it is a prime number or not*/
//18.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_47
{ 
    public static void main()
    {
        int i;
        int num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}