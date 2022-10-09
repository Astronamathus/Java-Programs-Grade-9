//Program_42
/*Write a program to print the sum of first 10 even numbers*/
//13.8.22
//Suday Dutta
//Greenwood High


class Program_42
{ 
    public static void main()
    {
        int i;
        int sum = 0;
        for(i=2;i<=10;i=i+2)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

