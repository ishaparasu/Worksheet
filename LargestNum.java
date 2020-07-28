/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templa1te file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.num;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class LargestNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 3 no");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && b>c)
            System.out.println("A is Great");
        else if(b>a && b>c)
            System.out.println("B is great");
        else
            System.out.println("C is great");
        
        
        
    }
    
}
