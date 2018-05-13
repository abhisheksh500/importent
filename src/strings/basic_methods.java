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
public class basic_methods {
    public static void main(String[] args) {
        String s = "abcdefghijl";
        String s2 = "abcdefghijk";
        String s3 = "abcdefghijl";
        String s4 = "";
        String s5="hello it's me ";
        String s6="HELLO IT'S ME";
       // char ch = s.charAt(5);//returns the char value at the 4th index
     //   System.out.println(ch);//return f
        //System.out.println(s.compareTo(s2));//return 1 becouse l is one time higher then k 
        //System.out.println(s.compareTo(s3));//return 0 becouse both are equal
        //s = s.concat("   is added");//add two strings
        //System.out.println(s);//return abcdefghijl   is added
       // System.out.println(s.contains("efg"));//return true becouse efg exist in s
        //System.out.println(s.endsWith("jl"));//return true becouse ending with jl
        //System.out.println(s.equals(s3));//return true becouse both strings are same
        //System.out.println(s.equalsIgnoreCase(s3));//same as equals only differance is this statement ignore case(uppercase,lower case)
        //byte[] b =s.getBytes();//show bites
        //for(int i=0;i<b.length;i++){  
        //System.out.println(b[i]);  //return byte
    //}
    //System.out.println(s4.isEmpty());//return true becouse s4 is empty
   // int index1=s.lastIndexOf('g');//returns last index of 'g' char value  
    //System.out.println(index1);//6
       // System.out.println(s.length());//return length 11
    //String replaceString=s.replace('a','e');//replaces all occurrences of 'a' to 'e'  
    //System.out.println(replaceString); 
      //String[] words=s5.split("\\s");//splits the string based on whitespace  
    //for(String w:words)//using java foreach loop to print elements of string array  
    //{  
    //System.out.println(w);  
    //  }
       // System.out.println(s.startsWith("abcd"));//return true becouse it start with abcd
    //System.out.println(s.substring(2,4));//returns cd
    //  String s6lower=s6.toLowerCase();  
    //System.out.println(s6lower);  //return lowercase
    //String supper=s.toUpperCase();  
        //System.out.println(supper);//return uppercase
        
    //System.out.println(s.trim()+"hello");//return abcdefghijlhello trim the space
    }
}
