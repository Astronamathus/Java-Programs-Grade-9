//Program_60
/*Write a program to print  the product of first n even numbers*/
//25.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_60
{ 
    public static void main()
    {
        int i = 2;
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers:");
        int n = sc.nextInt();
        while(i<=n*2)
        {
            product = product*i;
            i = i+2;
        }
        System.out.println(product);
    }
}

