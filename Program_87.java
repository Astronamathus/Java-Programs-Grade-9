//Program_87
/*Write a menu driven program to print different series*/
//29.10.22
//Suday Dutta
//Greenwood High

import java.util.*;
class Program_87
{ 
    public static void main()
    {
        char choice;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        n = sc.nextInt();
        System.out.println("Enter your choice below: ");
        System.out.println("a. 1    4   9   16  25.... n^2 ");
        System.out.println("b. 1    8   27  64  125..... n^3 ");
        choice = sc.next().charAt(0);
        switch(choice)
        {
            case 'a':
                for(int i = 0;i<=n;i++)
                {
                    System.out.print(i*i+"  ");
                }
                break;
            case 'b':
                for(int i = 0;i<=n;i++)
                {
                    System.out.print(i*i*i+"  ");
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
  }
}