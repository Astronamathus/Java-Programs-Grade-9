//Program_89
/*Write a nested loop program to print the following pattern:
   @@@@
   @@@@
   @@@@
   @@@@*/
//9.11.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_89
{ 
    public static void main()
    {
        int i, x;
        for(i = 1; i<=4; i++)
        {
            for(x  = 1; x <= 4; x++)
            {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}