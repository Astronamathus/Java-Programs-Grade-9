//Program_88_a
/*Write a program  to print the series n-1/n*/
//24.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_88_a
{ 
    public static void main()
    {
        int i;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below");
        i = sc.nextInt();
        for(double n = 2;n!=i;n++)
        {
            sum+= n-1/n;
        }
        System.out.println("The result is "+sum);
    }
}