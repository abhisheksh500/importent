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
public class immediate_parent {
    String color ="white";
}
class dog extends immediate_parent
{
    String color = "black";
    void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
class test
{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.printcolor();
    }
}

