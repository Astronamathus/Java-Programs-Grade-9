//Program_88_b
/*Write a program  to print the series 1 + x^1 + x^2 ...... + X^n*/
//24.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_88_b
{ 
    public static void main()
    {
        int x;
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below");
        x = sc.nextInt();
        System.out.println("Enter another number below");
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            sum+= Math.pow(x,i);
        }
        System.out.println("The result is "+sum);
    }
}