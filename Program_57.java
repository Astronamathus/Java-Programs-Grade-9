 //Program_57
/*Write a program to print the first n odd numbers*/
//22.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_57
{
    public static void main()
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of odd numbers to be printed");
        int n = sc.nextInt();
        while(i<=n*2)
        {
            System.out.println(i);
            i=i+2;
        }
    }
}

