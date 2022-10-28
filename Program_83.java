//Program_83
/*Write a program to input a number and print the sum of its factors.*/
//29.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_83
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
        while(i<=n);
        System.out.println(sum+" is the sum of the factors of "+n);
     }
}