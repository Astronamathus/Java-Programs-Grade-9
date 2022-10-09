//Program_31
/*Write a program to print the bill for an eltricity office after inputing previous month's readings and current month's meter readings*/
//1.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_31
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int previous;
        int current;
        int units;
        int bill;
        System.out.println("Enter previous month's readings below:");
        previous = sc.nextInt();
        System.out.println("Enter current month's readings below:");
        current = sc.nextInt();
        units = current - previous;
        if (units <=80)
        {
            bill = 250;
        }
        else if (units <= 150)
        {
            bill = 250 + (units - 80)*2;
        }
        else if (units <= 250)
        {
            bill = 250 + 70*2 + (units - 150)*3;
        }
        else
        {
            bill = 250 + 70*2 + 100*3 + (units - 250)*5;
        }
        System.out.println("Your bill for this month is Rs. "+bill);
    }
}