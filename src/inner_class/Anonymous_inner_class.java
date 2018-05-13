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
abstract class Anonymous_inner_class {
      abstract void eat();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
   Anonymous_inner_class p=new  Anonymous_inner_class(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }
}
