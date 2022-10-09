//Program_28
/*Write a program to input marks and print the results*/
//28.7.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_28
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int marks;
        String result;
        System.out.println("Enter your marks below:");
        marks = sc.nextInt();
        if (marks > 90)
        {
            result = "excellent";
        }
        else if (marks > 80)
        {
            result = "good";
        }
        else if (marks > 70)
        {
            result = "average";
        }
        else if (marks > 60)
        {
            result = "fair";
        }
        else
        {
            result = "poor";
        }
        System.out.println("Your marks are "+ result);
    }
}