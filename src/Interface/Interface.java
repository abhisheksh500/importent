/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


public class Interface implements demo {
    

    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }
    public static void main(String[] args) {
     demo d = new Interface();
     d.method1();
     d.method2();
    }
}
