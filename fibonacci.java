/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class fibonacci {
    
    public static void main(String [] args){
       Scanner obj=new Scanner(System.in);
        int a=1;
        int b=2;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            
            
        }
        
    }
}
