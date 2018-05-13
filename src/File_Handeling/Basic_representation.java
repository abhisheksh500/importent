/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Handeling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Basic_representation {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\demo_file.txt");
        f.createNewFile();
          //System.out.println(f.getAbsoluteFile());
      //  System.out.println(f.getAbsolutePath());
        //System.out.println(f.getCanonicalFile());
       // System.out.println(f.isHidden());
        //System.out.println(f.length());
        //System.out.println(f.list());
    //System.out.println(f.getFreeSpace());
        //System.out.println(f.getName());
        //System.out.println(f.getPath());
    }
}
