//Program_17
/*Write a program to input a value to the variable 'age' and print if it is a major or minor*/
//28/6/22
//Suday Dutta
// Greenwood High
import java.util.*;
class Program_17
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age below:");
        age = sc.nextInt();
        String result = (age>=18)?"Major":"Minor";
        System.out.println("You are a "+ result);
    }
}