//Program_9
/*Program to store capital 'A' in char variable and print it in lowercase*/
//23/6/22
//Suday Dutta
//Greenwood High

class Program_09
{
    public static void main()
    {
        char Uppercase = 'A';
        int Lowercase = (int)Uppercase + 32;
        char lowercase = (char)Lowercase; 
        System.out.println("Lowercase of char 'A' is "+lowercase);
    }
}