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
public class While_Statement {
    public static void main(String arg[])
    {
        int temp=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=2;
        while(i<=a/2)
        {
               if(a%i==0)
               {
                   temp=1;
               }
               i++;
        }
        if(temp==0)
            System.out.println("prime");
        else
            System.out.println(" not prime");
    }
}
