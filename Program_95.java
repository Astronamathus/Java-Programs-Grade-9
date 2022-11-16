//Program_95
/*Write a program to enter the roll number, name class and marks in 10 subjects students belonging to a class of 25 students. 
 *Calculate and print the average scored by each student.*/
//12.11.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_95
{ 
    public static void main()
    {
        double average = 0.0;
        int marks;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        for(int n=1; n<=5; n++)
        {
            System.out.print("Enter your roll number: ");
            int roll_no = sc.nextInt();
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your class: ");
            int clazz = sc.nextInt();
            for(int i = 1; i<=3; i++)
            {
                switch(i)
                {
                    case 1:
                        System.out.print("Enter your "+i+"st subject marks: ");
                        break;
                    case 2:
                        System.out.print("Enter your "+i+"nd subject marks: ");
                        break;
                    case 3:
                        System.out.print("Enter your "+i+"rd subject marks: ");
                        break;
                    default:
                        System.out.print("Enter your "+i+"th subject marks: ");
                        break;
                }
                marks = sc.nextInt();
                total += marks;
            }
            average = total/300;
            int percentage = (int)average*100;
            System.out.println("Your average is: "+percentage+"%");
        }
  }
}
