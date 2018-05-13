/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author Abhishek
 */
public class demo {
    class demo1
    {
        void demo1()
        {
            System.out.println("jhsa");
        }
    }
        public static void main(String arg[])
        {
            demo d = new demo();
            demo.demo1 d2 = d.new demo1();
            d2.demo1();
        }
}
