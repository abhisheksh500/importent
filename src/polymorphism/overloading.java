/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Abhishek
 */
public class overloading {
   /* static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
class test
{
    public static void main(String[] args) {
        System.out.println(overloading.add(10, 11));
        System.out.println(overloading.add(111, 112, 44));
    }*/   //overloading by changing no of arguments
    
     static int add(int a, int b)
    {
        return a+b;
    }
    static double add(double a,double b,double c)
    {
        return a+b+c;
    }
}
class test
{
    public static void main(String[] args) {
        System.out.println(overloading.add(10, 11));
        System.out.println(overloading.add(111.3, 112.4, 44.6));
    }
}//overloading by changing type of arguments 
