//Program_40
/*Write a program to print the first n odd numbers*/
//13.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_40
{
    public static void main()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of odd numbers to be printed");
        int n = sc.nextInt();
        for(i=1;i<=n*2;i=i+2)
        {
            System.out.println(i);
        }
    }
}

