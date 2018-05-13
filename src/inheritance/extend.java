/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Abhishek
 */
public class extend extends demo{
    public int income()
    {
        int sum =0;
        int bonus = 1000000;
        sum = salary+bonus;
        return sum;
    }
    public static void main(String[] args) {
        extend d = new extend();
        System.out.println(d.income());
    }
}
