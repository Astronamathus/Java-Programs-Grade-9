//Program_19
/*Write a program to enter digits for units tens and hundreds place and use mathematical relaitons to print the number*/
//25/6/22
//Suday Dutta
// Greenwood High
import java.util.*;
class Program_19
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int u;
        int t;
        int h;
        System.out.println("Enter units place below:");
        u = sc.nextInt();
        System.out.println("Enter tens place below:");
        t = sc.nextInt();
        System.out.println("Enter hunderds place below:");
        h = sc.nextInt();
        int result = (h*100)+(t*10)+(u*1);
        System.out.println("The number is "+ result);
    }
}