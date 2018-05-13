/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_key;

/**
 *
 * @author Abhishek
 */
public class invoke_parent {
     
      void printcolor()
      {
           String color ="white";
           System.out.println(color);
      }
}
class dog1 extends invoke_parent
{
    String color = "black";
    void printcolor()
    {
        System.out.println(color);
        super.printcolor();
    }
}
class test11
{
    public static void main(String[] args) {
        dog1 obj = new dog1();
        obj.printcolor();
    }  
}
