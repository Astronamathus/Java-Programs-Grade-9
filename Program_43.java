//Program_43
/*Write a program to print  the product of first n even numbers*/
//13.8.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_43
{ 
    public static void main()
    {
        int i;
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers:");
        int n = sc.nextInt();
        for(i=2;i<=n*2;i=i+2)
        {
            product = product*i;
        }
        System.out.println(product);
    }
}

