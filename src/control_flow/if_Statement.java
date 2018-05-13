/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_flow;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class if_Statement {
    public static void main(String arg[])
            
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if(a > 0)
        {
            System.out.println("positive");
        }
        else if(a==0)
        {
            System.out.println("a is nither positive nor negative");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
