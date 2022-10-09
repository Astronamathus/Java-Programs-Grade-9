//Program_59
/*Write a program to print the sum of first 10 even numbers*/
//25.8.22
//Suday Dutta
//Greenwood High


class Program_59
{ 
    public static void main()
    {
        int i = 2;
        int sum = 0;
        while(i<=20)
        {
            sum = sum + i;
            i=i+2;
        }
        System.out.println("The sum of the first 10 even numbers is "+sum);
    }
}

