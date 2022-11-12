//Program_91
/*Write a nested loop program to print the following pattern:
   1 1 1 1 1
   1 1 1 1
   1 1 1 
   1 1
   1*/
//9.11.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_91
{ 
    public static void main()
    {
        int i, x;
        for(i = 1; i<=5; i++)
        {
            for(x = 5; x >= i; x--)
            {
                System.out.print(1+ " ");
            }
            System.out.println(" ");
        }
    }
}