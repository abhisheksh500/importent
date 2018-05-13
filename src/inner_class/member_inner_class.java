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
public class member_inner_class {
    private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  member_inner_class obj=new member_inner_class();  
  member_inner_class.Inner in=obj.new Inner();  
  in.msg();  
 } 
}
