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
public class static_inner_class {
    static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  static_inner_class.Inner obj=new static_inner_class.Inner();  
  obj.msg();  
  }
}
