/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerdigit;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Integerdigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,dig,temp,count=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number:");
        num=obj.nextInt();
        temp=num;
        while(num>0)
        {
            num=num%10;
            count++;
        }
        while(temp>0)
        {
            dig=temp%10;
            System.out.println("the place at "+count+" is "+dig);
            temp=temp/10;
            count++;
        }
        // TODO code application logic here
    }
    
}
