//Program_66
/*Write a program to input a number and print the sum of its factors.*/
//29.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_66
{ 
    public static void main()
    {
        int i = 1;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        n = sc.nextInt();
        while(i<=n)
        {
            if(n%i == 0)
            {
               sum = sum+i; 
            }
            i++;
        }        
        System.out.println(sum+" is the sum of the factors of "+n);
     }
}