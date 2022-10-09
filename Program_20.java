//Program_20
/*Write a java program to enter value of mass and print the computed kinetic Energy by the formula: K.E. = 1/2mv^2where v= 10 m/sec*/
//25/6/22
//Suday Dutta
// Greenwood High
import java.util.*;
class Program_20
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double m;
        double v = 10.0;
        System.out.println("Enter mass below:");
        m = sc.nextDouble();
        double KE = m/2 * v * v;
        System.out.println("The Kinetic Energy is "+KE+" joules");
    }
}