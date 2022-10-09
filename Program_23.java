//Program_23
/*Write a program to input principal and time and print simpleinterest with rate 8% if time is greater else print with 12%*/
//27/6/22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_23
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int principal;
        int time;
        int rate;
        System.out.println("Enter principal below:");
        principal = sc.nextInt();
        System.out.println("Enter time below:");
        time = sc.nextInt();
        if (time > 2)
        {
            rate = 8;
        }
        
        else
        {
            rate = 12;
        }
        int simple_interest = (principal*rate*time)/100;
        System.out.println("The simple interest is "+ simple_interest);
    }
}