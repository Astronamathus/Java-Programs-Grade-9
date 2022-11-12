//Program_92
/*Write a nested loop program to print the following pattern:
   1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15*/
//9.11.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_92
{ 
    public static void main()
    {
        int i, x, num = 1;
        for(i = 1; i<=5; i++)
        {
            for(x  = 1; x <= i; x++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println(" ");
        }
    }
}