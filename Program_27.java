//Program_27
/*Write a program to input a chracter and print wether it is a letter or a digit*/
//28.7.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_27
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char input;
        String output;
        System.out.println("Enter a character below:");
        input = sc.next().charAt(0);
        int input_int = (int)input;
        if (input_int >= 65 && input <= 122)
        {
            System.out.println("The character is a letter");
        }
        else if (input_int >= 48 && input <= 57)
        {
            System.out.println("The character is a digit");
        }        
        else
        {
            System.out.println("Invalid Input");
        }
    }
}