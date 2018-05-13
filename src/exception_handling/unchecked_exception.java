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
public class unchecked_exception {
    public static void main(String[] args) {
       /*try { //Arithmetic Exception
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
            }*/ 
       /*try        //NullPointerException
       {
           String s = null;
           System.out.println(s.charAt(0));
       }
       catch(NullPointerException e)
       {
           System.out.println("null value");
       }*/
       /*try        //Number Format Exception 
       {
           String s ="sbhi";
           int i = Integer.parseInt(s);
           System.out.println(i);
       }
       catch(NumberFormatException e)
       {
           System.out.println("NumberFormatException ");
       }*/
      /* try        //Array Index OutOf Bounds Exception
       {
           int a[] = new int[5];
           a[6]=19;
           System.out.println(a[6]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("ArrayIndexOutOfBoundsException ");
       }*/
    }
}
