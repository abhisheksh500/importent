
package instance_block;


public class instance {
    int result = 10;
    instance()
    {
        System.out.println("first result"+result);
    }
    {
        System.out.print("Second result"+result);
    }
}
class output//instance block
{
    public static void main(String arg[]){
        instance i = new instance();
        
    }
}
