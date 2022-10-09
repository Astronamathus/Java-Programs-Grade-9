//Program_32
/*Write a program to input a digit and print it in words*/
//4.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_32
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int digit;
        String result;
        System.out.println("Enter a digit below:");
        digit = sc.nextInt();
        switch(digit)
        {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Invalid number";
        }
        System.out.println("The number is "+ result);
    }
}