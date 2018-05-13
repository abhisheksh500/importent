/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Abhishek
 */
public class Stringbuffer_representation {
    public static void main(String[] args) {
       StringBuffer s = new StringBuffer();//basic represantation//capacity is 16
        StringBuffer s2 = new StringBuffer(20);//it accept int argument//capacity is 20
        StringBuffer s3 = new StringBuffer("String buffer");//directly take string//capacity is 29
        //System.out.println(s3);
        //int a =s3.length();
        //System.out.println(a);//return 13 length of s3
        //int b = s3.capacity();
        //System.out.println(b);//return 29 because capacity of s3 is 29
        //s3.append("is good");
        //System.out.println(s3);//used to add text at the end of the existence text.
        //s3.append(1);
        //System.out.println(s3);//used to add int at the end of the existence text.
        //s3.insert(6, " of");//insert text at the specified index position
        //System.out.println(s3);//return String of buffer
        //s3.reverse();//return string in reverse
        //System.out.println(s3);//return reffub gnirtS
        //s3.delete(0, 6);//delete the object from starting index 0 to 6th index
        //System.out.println(s3);//return buffer
        //s3.deleteCharAt(7);//delete the 7th position
        //System.out.println(s3);//return String uffer
        //s3.replace(6, 7,"of");//substring being replaced is specified by the indexes start Index and endIndex
        //System.out.println(s3);//return StringofbufferS
    }
}
