/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class throw_throws {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
        if(age<18)  
      throw new Exception("not valid");  
     else  
      System.out.println("welcome to vote"); 
    }
}
