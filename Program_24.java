//Program_24
/*Write a program to input a number and print its square if is even else print its cube*/
//27/6/22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_24
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int result;
        System.out.println("Enter a number below:");
        num = sc.nextInt();
        if (num % 2 == 0)
        {
            result = num*num;
        }
        
        else
        {
            result = num*num*num;
        }
        System.out.println("The result is "+ result);
    }
}