//Program_94
/*Write a nested loop program to print the following pattern:
   a
   a a
   a a a
   a a a a
   a a a a a
   a a a a
   a a a
   a a
   a*/
//9.11.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_94
{ 
    public static void main()
    {
        int i, x, j, y;
        for(i = 1; i<=5; i++)
        {
            for(x  = 1; x <= i; x++)
            {
                System.out.print('a'+" ");
                
            }
            System.out.println(" ");
        }
        for(j = 4; j>=0; j--)
        {
            for(y = 0; y<j; y++)
            {
                System.out.print('a'+" ");                            
            }
            System.out.println(" ");
        }
    }
}
