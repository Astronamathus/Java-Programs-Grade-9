//Program_81
/*Write a program to input a number and print whether it is a prime number or not*/
//29.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_81
{ 
    public static void main()
    {
        int i = 1;
        int num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        num = sc.nextInt();
        do
        {
            if(num%i == 0)
            {
                count++;
            }
            i++;
        }
        while(i<=num);
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