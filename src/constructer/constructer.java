
package constructer;

import java.util.Scanner;

public class constructer {
    private String Name;
    private int rollno;
    private int id;

    public constructer(String Name, int rollno) {//constructor with perameters  
        this.Name = Name;
        this.rollno = rollno;
        System.out.println(Name+" "+rollno);
    }

    public constructer()  //constructor without peramerterise
    {
        
        System.out.println("Non peramerterise constructor");
    }
    
}
class output//constructor
{
public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 String name = sc.nextLine();
 int id = sc.nextInt();
 int password = sc.nextInt();
 constructer c = new constructer(name,password);
 constructer c2 = new constructer();
}
}