//Program_64
/*Write a program to input a number and print whether it is a prime number or not*/
//29.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_64
{ 
    public static void main()
    {
        int i = 1;
        int num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        num = sc.nextInt();
        while(i<=num)
        {
            if(num%i == 0)
            {
                count++;
            }
            i++;
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