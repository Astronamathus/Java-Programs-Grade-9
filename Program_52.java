//Program_52
/*Write a program to input a number and print if it is a perfect number or not*/
//18.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_52
{ 
    public static void main()
    {
        int i;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        n = sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i == 0)
            {
               sum = sum+i; 
            }
        }   
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