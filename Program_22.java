//Program_22
//25-6-22
//Suday Dutta
//Greenwood High
//Program to convert your height from cm to feet and inches//
import java.io.*;
public class Program_22
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double cm;
        double inches;
        System.out.println("Enter your height in centimeters");
        cm = Integer.parseInt(br.readLine());
        inches = cm/2.54;
        double feet = inches/12;
        System.out.println("Your hieght in inches is "+inches);
        System.out.println("Your hieght in feet is "+feet);
    }
}