//Program_86
/*Write a program to input a number and print if it is a perfect number or not*/
//29.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_86
{ 
    public static void main()
    {
        int i = 1;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        n = sc.nextInt();
        do
        {
            if(n%i == 0)
            {
               sum = sum+i; 
            }
            i++;
        }
        while(i<n);
        if (sum == n)
        {
            System.out.println(n+" is a perfect number");
        }
        else 
        {
            System.out.println(n+" is not a perfect number");
        }
  }
}