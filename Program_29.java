//Program_29
/*Write a program to input 3 marks and print them in ascending order*/
//28.7.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_29
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        String result;
        System.out.println("Enter first number below:");
        num1 = sc.nextInt();
        System.out.println("Enter second number below:");
        num2 = sc.nextInt();
        System.out.println("Enter third number below:");
        num3 = sc.nextInt();
        if (num1 < num2 && num2 < num3)
        {
            System.out.println("The ascending order is: "+ num1+","+ num2+","+ num3 );
        }
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println("The ascending order is: "+ num3+"," + num2+"," + num1);
        }
        else if (num2 < num1 && num1 < num3)
        {
            System.out.println("The ascending order is: "+ num2+","+ num1+","+ num3);
        }
        else if (num2 > num1 && num1 > num3)
        {
            System.out.println("The ascending order is: "+ num3+"," + num1+"," + num2);
        }
        else if (num2 < num3 && num3 < num1)
        {
            System.out.println("The ascending order is: "+ num2+","+ num3+"," + num1);
        }
        else if (num2 > num3 && num3 > num1)
        {
            System.out.println("The ascending order is: "+ num1+"," + num3+"," + num2);
        }
        
        else
        {
            System.out.println("Invalid Input");
        }
    }
}