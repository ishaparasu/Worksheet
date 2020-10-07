/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex_10;

import java.util.Scanner;

/**
 *
 * @author Isha parasu
 */
public class File {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the file name:"); //file name:file.txt
        String filename=obj.next(); //getting filename as input from the user
        java.io.File f=new java.io.File(filename);
        if(f.exists()) //if file exists
            System.out.println("File exists");
        else //if file does not exist
        {
            System.out.println("File doesn't exist");
            return;
        }
        System.out.println("Name of the file is:"+f.getName()); //prints the name of file
        System.out.println("Length of the file is:"+f.length()+" bytes"); //prints the length of the file in byte form
        System.out.println("Readable:"+f.canRead()); //checks if the file is readable and retuns true if the file is readable
        System.out.println("Writable:"+f.canWrite()); //checks if the file is writable and retuns true if the file is writable
    }
}
