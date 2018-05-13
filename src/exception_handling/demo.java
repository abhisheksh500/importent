/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author Abhishek
 */
public class demo {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        try{
            System.out.println(a[5]);
        }
        catch(Exception e)
        {
            System.out.println("memory out of bound");
        }
    }
}
