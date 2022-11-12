//Program_93
/*Write a nested loop program to print the following pattern:
   1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5*/
//9.11.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_93
{ 
    public static void main()
    {
        int i, x;
        for(i = 1; i<=5; i++)
        {
            for(x  = 1; x <= i; x++)
            {
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }
}