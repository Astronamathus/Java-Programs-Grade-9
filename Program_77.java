//Program_77
/*Write a program to print the sum of first 10 even numbers*/
//11.10.22
//Suday Dutta
//Greenwood High


class Program_77
{ 
    public static void main()
    {
        int i = 2;
        int sum = 0;
        do
        {
            sum = sum + i;
            i=i+2;
        }
        while(i<=20);
        System.out.println("The sum of the first 10 even numbers is "+sum);
    }
}

