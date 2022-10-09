//Program_33
/*Write a program to input a number of a day of the week and print the day*/
//4.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_33
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int number;
        String result;
        System.out.println("Enter the number of a day below:");
        number = sc.nextInt();
        switch(number)
        {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Not a day of the week";
        }
        System.out.println("The day is "+ result);
    }
}