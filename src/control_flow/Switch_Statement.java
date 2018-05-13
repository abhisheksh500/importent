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
public class Switch_Statement {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("press 1 for add");
        System.out.println("press 2 for sub");
        System.out.println("press 3 for multiply");
        
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
                break;
            }  
            case 2:
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
               System.out.println(a-b);
               break;
            }
            case 3:
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a*b);
                break;
            }
                default:
                System.out.println("invalid input");
                
        }
    }
}
