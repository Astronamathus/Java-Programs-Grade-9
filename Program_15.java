//Program_15
/*Write a program to assign value to 'marks' and print excellent if marks >90 and so on*/
//25/6/22
//Suday Dutta
// Greenwood High

class Program_15
{
    public static void main()
    {
        int marks = 10;
        String result = (marks>90)?"Excellent":(marks>80)?"Good":(marks>70)?"Average":(marks>60)?"Fair":"Poor";
        System.out.println("Your result is "+result);
    }
}