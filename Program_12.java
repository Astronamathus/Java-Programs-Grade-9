//Program_12
/*Program to assign value to variable 'length' and 'breadth' and print wether it is a square or a rectangle*/
//23/6/22
//Suday Dutta
//Greenwood High

class Program_12
{
    public static void main()
    {
        int length = 98;
        int breadth = 12;
        String result  = (length == breadth)?"Square":"Rectangle";
        System.out.println("The shape is a "+result);
    }
}