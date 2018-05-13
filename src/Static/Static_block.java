
package Static;


public class Static_block {
    static int i;
    static 
    {
        i =10;
        System.out.println("static block");
    }
}
class output//static block
{
    public static void main(String arg[])
    {
        System.out.println(Static_block.i);
    }
}
