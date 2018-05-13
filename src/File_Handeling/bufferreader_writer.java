/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Handeling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Abhishek
 */
public class bufferreader_writer {
    public static void writerData() throws IOException
    {
        File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\demo1.txt");
        FileWriter wr = new FileWriter(f);
        if(f==null)
        {
            System.out.println("null");
            f.mkdir();
        }
        else
        {
            BufferedWriter bw = new BufferedWriter(wr);
            bw.write("hello hey hey");
            bw.flush();
        }
    }
    public static void readData() throws FileNotFoundException, IOException
    {
        File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\demo1.txt");
 FileReader fr =new FileReader(f);
        String line;       
        BufferedReader br=new BufferedReader(fr);
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
    }
    public static void createFile() throws IOException
    {
        File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\demo1.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        if(f==null)
        {
            System.out.println("null");
        }
        else
        {
            BufferedWriter bw = new BufferedWriter(fw);
         bw.write("heyyyyyyyy any one there");
         bw.flush();
        }
    }
    
    public static void main(String[] args) throws IOException {
       // writerData();
        //readData();
        createFile();//override the present data
            
    }
}
