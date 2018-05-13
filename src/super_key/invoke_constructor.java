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
public class invoke_constructor {
    invoke_constructor ()
    {
        System.out.println("superkey");
    }
}
class dog2 extends invoke_constructor 
{
    dog2()
    {
        super();
        System.out.println("nnxssss");
    }
}
class test3
{
    public static void main(String[] args) {
        dog2 obj = new dog2();
        
    }
}
