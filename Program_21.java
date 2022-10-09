//Program_21
/*Program to assign value to variable 'length' and 'breadth' and print wether it is a square or a rectangle*/
//7/7/22
//Suday Dutta
//Greenwood High
import java.io.*;
class Program_21
{
    public static void main() throws IOException
    {
        int length;
        int breadth;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter length below");
        length = Integer.parseInt(br.readLine());
        System.out.println("Enter breadth below");
        breadth = Integer.parseInt(br.readLine());
        String result  = (length == breadth)?"Square":"Rectangle";
        System.out.println("The shape is a "+result);
    }
}