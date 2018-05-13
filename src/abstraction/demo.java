
package abstraction;


abstract class demo {
   abstract void display();
}
class demo2 extends demo
{
    void display()
    {
    System.out.println("Abstract class creater");
}
    public static void main(String[] args) {
        demo d = new demo2();
        d.display();
    }
}
