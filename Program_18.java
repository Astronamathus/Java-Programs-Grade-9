//Program_18
/*Write a program to enter a class to the variable 'standard' and print wether it is high school or middle school*/
//28/6/22
//Suday Dutta
// Greenwood High
import java.util.*;
class Program_18
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int standard;
        System.out.println("Enter your standard below:");
        standard = sc.nextInt();
        String result = (standard>=8)?"High School":"Middle School";
        System.out.println("You are in "+ result);
    }
}