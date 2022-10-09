//Program_49
/*Write a program to input a number and print the sum of its factors.*/
//18.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_49
{ 
    public static void main()
    {
        int i;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
               sum = sum+i; 
            }
        }        
        System.out.println(sum+" is the sum of the factors of "+n);
     }
}