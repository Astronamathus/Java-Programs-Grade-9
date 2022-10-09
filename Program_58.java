//Program_58
/*Write a program to print the sum of first ten numbers*/
//25.8.22
//Suday Dutta
//Greenwood High


class Program_58
{ 
    public static void main()
    {
        int i = 1;
        int sum = 0;
        while(i<=10)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of the first 10 numbers is "+sum);
    }
}

