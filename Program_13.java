//Program_13
/*Program to assign value to variable 'Principal' and 'time' and if time is greater than 2 print simple interest with
 * 10% otherwise print with 8%*/
//23/6/22
//Suday Dutta
//Greenwood High

class Program_13
{
    public static void main()
    {
        int principle = 25000;
        int time = 4;
        int simple_interest = (time > 2)?(principle*8*time)/100:(principle*10*time)/100;
        System.out.println("The simple ineterest is "+simple_interest);
    }
}