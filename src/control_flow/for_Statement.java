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
public class for_Statement {
    public static void main(String arg[])
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        int ar[] = {10,20,30,40,50};//int ar[] = new int[10];(another way of writing array)
        for(int i =ar.length-1,j=0;j<i;i--)
        {
            temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;
            j++;
        }
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }
    }
}
