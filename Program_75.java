 //Program_75
/*Write a program to print the first n odd numbers*/
//11.10.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_75
{
    public static void main()
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of odd numbers to be printed");
        int n = sc.nextInt();
        do
        {
            System.out.println(i);
            i=i+2;
        }
        while(i<=n*2);
    }
}

