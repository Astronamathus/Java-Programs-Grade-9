//Program_76
/*Write a program to print the sum of first ten numbers*/
//11.10.22
//Suday Dutta
//Greenwood High


class Program_76
{ 
    public static void main()
    {
        int i = 1;
        int sum = 0;
        do
        {
            sum = sum + i;
            i++;
        }
        while(i<=10);
        System.out.println("The sum of the first 10 numbers is "+sum);
    }
}

