//Program_25
/*Write a program to input sides of a triangle and print wether it is scalene, isosceles or equilateral*/
//7/7/22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_25
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        String result;
        System.out.println("Enter the first side below:");
        side1 = sc.nextInt();
        System.out.println("Enter the second side below:");
        side2 = sc.nextInt();
        System.out.println("Enter the third side below:");
        side3 = sc.nextInt();
        if (side1 == side2 && side2 == side3)
        {
            result = "equilateral";
        }
        
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
             result = "isosceles";
        }
        else
        {
             result = "scalene";
        }
        System.out.println("The triangle is "+ result);
    }
}