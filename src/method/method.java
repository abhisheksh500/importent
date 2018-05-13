
package method;

import java.util.Scanner;


public class method {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int diff(int a,int b)
    {
        return a-b;
    }
}
class output//method
{
    public static void main(String arg[])
    { int a = 0,b = 0;
    Scanner sc = new Scanner(System.in);
         a= sc.nextInt();
         b=sc.nextInt();
        method s = new method();
        int m = s.sum(a, b);
        int n =s.diff(a, b);
        System.out.println("Addition"+m+"     sub"+n);
                
        
    }
} 
