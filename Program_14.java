//Program_14
/*Write a program to assign your variable a number, if number is even, print its square else print its cube*/
//25/6/22
//Suday Dutta
// Greenwood High
class Program_14
{
    public static void main()
    {
        int num = 7;
        int result = (num % 2 == 0)?(num*num):(num*num*num);
        System.out.println("The result is "+result);
    }
}