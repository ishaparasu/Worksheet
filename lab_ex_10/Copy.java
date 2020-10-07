/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Isha parasu
 */
public class Copy {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Lab_ex_10\\src\\lab_ex_10\\input.txt");
            FileOutputStream fos=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Lab_ex_10\\src\\lab_ex_10\\input1.txt");  
            int read;
            while((read=fis.read())!=-1)
            {
                if(read==' ') //if space is encountered, skip the loop by use of "continue" statement
                continue;
                fos.write(read); //writing each character to "two.txt" file
            }
            fis.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
